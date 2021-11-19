FROM openjdk:8-jdk-alpine
COPY target/pick-and-pack-back-0.0.1-SNAPSHOT.jar pick-and-pack-back.jar
ENTRYPOINT ["java", "-jar", "/pick-and-pack-back.jar"]