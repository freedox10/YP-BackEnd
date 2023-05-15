FROM amazoncorretto:8-alpine-jdk
MAINTAINER AAF
COPY target/aaf-0.0.1-SNAPSHOT.jar aaf-app.jar
ENTRYPOINT ["java","-jar","/aaf-app.jar"]
EXPOSE 8080