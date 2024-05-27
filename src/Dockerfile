#
# Build stage
#
FROM maven:3-eclipse-temurin-17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

LABEL org.name="nactrem4"
#
# Package stage
#
FROM eclipse-temurin:17-jdk-jammy
COPY --from= build /home/gradle/src/build/libs/BuildABoard-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
