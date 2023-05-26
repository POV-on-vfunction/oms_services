#Start with a base image containing Java Runtime
FROM openjdk:8-jdk-alpine

#Make port 8081 of the container available to the outside world
EXPOSE 8081


ADD ./target/InventoryController-1.0-SNAPSHOT.jar InventoryController-1.0-SNAPSHOT.jar

#RUN cp target/InventoryController-1.0-SNAPSHOT.jar /usr/share/${JAR_FILE}

#Run the Jar File
ENTRYPOINT ["java","-jar","/InventoryController-1.0-SNAPSHOT.jar"]
