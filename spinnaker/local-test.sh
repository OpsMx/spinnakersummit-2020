export DECK_POD=$(kubectl get pods --namespace spinnaker -l "cluster=spin-deck" -o jsonpath="{.items[1].metadata.name}")
kubectl port-forward --namespace spinnaker $DECK_POD 9000 &

export GATE_POD=$(kubectl get pods --namespace spinnaker -l "cluster=spin-gate" -o jsonpath="{.items[0].metadata.name}")
kubectl port-forward --namespace spinnaker $GATE_POD 8084 &
