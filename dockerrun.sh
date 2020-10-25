#!/bin/bash
(cd /opt;nohup java -jar /opt/restapp.jar > /var/log/restapp.log 2>&1 &)
sudo chmod 775 /var/log/restapp.log
sudo tail -f /var/log/restapp.log &

sleep infinity
