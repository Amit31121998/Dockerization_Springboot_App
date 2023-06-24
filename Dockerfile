FROM openjdk:11

COPY target/first-docker-app.war  usr/app/

WORKDIR /usr/app

EXPOSE 9090 

ENTRYPOINT [ "java","-jar","first-docker-app.war" ]
