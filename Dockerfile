FROM openjdk:11
MAINTAINER Tongtong Zhang

WORKDIR /app
COPY target/StoreApi.jar /app/StoreApi.jar
ENTRYPOINT ["java", "-jar", "/app/StoreApi.jar"]
ENV PORT=8080
EXPOSE 8080