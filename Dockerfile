FROM java:11
VOLUME /tmp
EXPOSE 8089
ADD target/restdemo-0.0.1-SNAPSHOT.jar restdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","restdemo-0.0.1-SNAPSHOT.jar"]