FROM java:8
VOLUME /tmp
ADD microservice-springboot-docker-employee-app-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/ems","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]