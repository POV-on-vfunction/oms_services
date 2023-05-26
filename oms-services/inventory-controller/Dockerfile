#Start with a base image containing Java Runtime
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=../target/*.jar

COPY ./target/InventoryController-1.0-SNAPSHOT.jar inv.jar

#ADD ./target/InventoryController-1.0-SNAPSHOT.jar inv.jar

#Make port 8081 of the container available to the outside world
EXPOSE 8081

#Run the Jar File
ENTRYPOINT ["java","-jar","/inv.jar"]
