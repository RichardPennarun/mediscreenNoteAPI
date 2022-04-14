FROM openjdk:11
ARG JAR_FILE=build/libs/MediscreenNoteAPI-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} MediscreenNoteAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/MediscreenNoteAPI-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082