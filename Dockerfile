FROM opsmx11/java:14.04-openjdk-8-jdk
## restapp port ####
ENV server_port=8080
COPY dockerrun.sh /usr/local/bin/dockerrun.sh
# RUN chmod +x /usr/local/bin/dockerrun.sh
COPY /target/restapp.jar /opt/restapp.jar
CMD ["dockerrun.sh"]
