FROM gradle:jdk18-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM eclipse-temurin:18-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/BuildABoardSo2024-3.2.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
