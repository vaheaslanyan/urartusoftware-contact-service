FROM openjdk:17
WORKDIR /opt
EXPOSE 8080
RUN ./gradlew build
COPY /build/libs/*.jar /opt/app.jar
ENTRYPOINT exec java -jar app.jar