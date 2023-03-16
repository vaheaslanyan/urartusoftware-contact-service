# using multistage docker build
# ref: https://docs.docker.com/develop/develop-images/multistage-build/

# temp container to build using gradle
FROM gradle:7.6.1-jdk17 AS TEMP_BUILD_IMAGE
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle settings.gradle $APP_HOME

COPY gradle $APP_HOME/gradle
COPY --chown=gradle:gradle . /home/gradle/src
USER root
RUN chown -R gradle /home/gradle/src

RUN gradle build || return 0
COPY . .
RUN gradle clean build

# actual container
FROM openjdk:17
WORKDIR $APP_HOME
EXPOSE 8080
COPY --from=TEMP_BUILD_IMAGE $APP_HOME/build/libs/*.jar .
ENTRYPOINT exec java -jar app.jar

#FROM openjdk:17
#WORKDIR $APP_HOME
#EXPOSE 8080
#COPY /build/libs/*.jar /opt/app.jar
#ENTRYPOINT exec java -jar app.jar