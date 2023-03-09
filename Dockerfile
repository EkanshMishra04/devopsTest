from openjdk
EXPOSE 8089
ADD target/DevOpsAssignment-0.0.1-SNAPSHOT.jar DevOpsAssignment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DevOpsAssignment-0.0.1-SNAPSHOT.jar"]