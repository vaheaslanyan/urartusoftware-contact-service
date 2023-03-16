FROM openjdk:17
EXPOSE 8080
RUN ./gradlew build
COPY /build/libs/*.jar /opt/app.jar
ENTRYPOINT exec java -jar app.jar