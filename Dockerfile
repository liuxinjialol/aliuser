FROM  openjdk:8-alpine
ADD target/user-1.0.jar app.jar 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]