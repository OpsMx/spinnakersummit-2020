# Setting up NFS server in your Kubernetes cluster

You must have cluster admin privileges to do this.

### Install NFS server

```
helm repo add stable https://kubernetes-charts.storage.googleapis.com/
helm install -n nfs nfs-server stable/nfs-server-provisioner --set persistence.enabled=true,persistence.size=10Gi
```

You can check that storageclass nfs is setup in your cluster:

```
kubectl get storageclass
```

Output should have nfs as a storage class:

```
NAME     PROVISIONER                                       AGE
nfs      cluster.local/nfs-server-nfs-server-provisioner   6h30m
```

### Setup a NFS persistence volume claim

Look at the included pvc.yaml. Apply it to the kubernetes cluster:

```
kubectl apply -f pvc.yaml
```
