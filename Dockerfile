FROM amazoncorretto:11-alpine-jdk //imagen de partida
MAINTAINER AAF //propietario
COPY target/aaf-0.0.1-SNAPSHOT.jar aaf-app.jar   //copia el empaquetado a github
ENTRYPOINT ["java","-jar","/aaf-app.jar"]    //instruccion de primera ejecucion
