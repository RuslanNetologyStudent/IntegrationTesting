FROM adoptopenjdk/openjdk11-openj9

EXPOSE 8080

COPY target/NetologySpringBootTask5-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app."]