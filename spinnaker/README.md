# Setting up Spinnaker using Helm Chart

Installing Spinnaker using helm chart:

```
helm repo add stable https://kubernetes-charts.storage.googleapis.com/

helm install -n spinnaker spinnaker stable/spinnaker -f values.yaml
```

If stable repo is not available, you can use a replica of it from Artifacthub:
```
helm repo add spinnaker https://helmcharts.opsmx.com/

helm install -n spinnaker spinnaker spinnaker/spinnaker
```

To get the chart from the above repo, you can run
```
helm pull spinnaker/spinnaker
```
That should download spinnaker-2.2.3.tgz. You can extract to get the chart source. And that will have the default values.yaml
```
tar xvf spinnaker-2.2.3.tgz
cd spinnaker
```

In values.yaml, you can customize:

- version of Spinnaker deployed
- version of halyard image
- custom bom file for Spinnaker
- customize service and profile settings
- customize storage
- enable high-availability
- customize component sizing
- run additional hal config commands


### Configuring for LDAP Authentication

```
hal config security authn ldap edit --user-dn-pattern="cn={0}" --url=ldap://openldap.default:389/dc=example,dc=org

hal config security authn ldap enable

hal config security ui edit --override-base-url http://YOUR_DECK_HOSTNAME

hal deploy apply
```
