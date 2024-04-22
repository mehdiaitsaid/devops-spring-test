FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/devops-0.0.1-SNAPSHOT.jar devops-0.0.1-SNAPSHOT.jar
EXPOSE 80
CMD ["java","-jar","devops-0.0.1-SNAPSHOT.jar"]