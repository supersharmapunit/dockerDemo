FROM openjdk
RUN mkdir /app
WORKDIR /app
COPY target/dockerDemo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

ENTRYPOINT ["java","-jar","dockerDemo-0.0.1-SNAPSHOT.jar"]