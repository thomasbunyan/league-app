#
# Build
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
RUN echo $(ls -1 /home/app/)

#
# Package
#
FROM openjdk:14-jdk-oracle
COPY --from=build /home/app/target/api-server-1.0-SNAPSHOT.jar /usr/local/lib/api-server-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "/usr/local/lib/api-server-1.0-SNAPSHOT.jar"]