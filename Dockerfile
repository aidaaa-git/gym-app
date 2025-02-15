FROM openjdk:21-jdk
COPY ./target/gymApp-1.0-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "gymApp-1.0-SNAPSHOT.jar"]