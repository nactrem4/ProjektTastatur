FROM gradle:jdk17-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
ARG DB_PASSWORD
ARG DB_URL
ARG DB_USERNAME
RUN gradle build --no-daemon

FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/BuildABoardSo2024-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
