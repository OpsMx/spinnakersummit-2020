# Spinnaker Summit 2020

## Run Jobs

Using Spinnaker Run jobs one can run tasks like updating a database, interacting with third-party systems like Jira or ServiceNow, run tests and even builds! In this example, the run job does a maven build on a git repo, builds a docker image using kaniko and finally deploys the built image.

**Resources**

pipeline.json: The json representation of the pipeline used in the demo

src/* : The source could of a simple application

**Creating secret for kaniko**

Use the config.json. Update the auth to the correct value. For Dockerhub it is:
`
echo -n USER:PASSWORD | base64
`

And the file as a secret into kubernetes:
`
kubectl create secret generic kaniko-secret --from-file=<path to config.json>
`

More information on Kaniko can be found in https://github.com/GoogleContainerTools/kaniko/blob/master/README.md

## Additional Setup Instructions

### Spinnaker

Setting up of Spinnaker using Helm along with a customized values.yaml is defined in the directory spinnaker.

### Enable Authentication with OpenLDAP

Refer to the blog https://www.opsmx.com/blog/deploying-spinnaker-in-gke-with-ldap-authentication/

### NFS

NFS can be used for ReadWriteMany Persistence Volume in Kubernetes. The nfs directory contains instructions to setup a NFS server in a Kubernetes cluster.
