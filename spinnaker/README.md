# Setting up Spinnaker using Helm Chart

Installing Spinnaker using helm chart:

```
helm repo add stable https://kubernetes-charts.storage.googleapis.com/

helm install -n spinnaker spinnaker stable/spinnaker -f values.yaml
```

In values.yaml, one can customize:

- version of Spinnaker deployed
- custom bom file for Spinnaker
- customize service and profile settings
- customize storage
- enable high-availability
- customize component sizing
- run additional hal config commands
