FROM openjdk:11
EXPOSE 9002
ARG JAR_FILE=build/libs/musicplayer-0.0.1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
