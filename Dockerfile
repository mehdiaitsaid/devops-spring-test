FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
EXPOSE 8080
RUN mvn install --no-transfer-progress -DskipTests=true
ENTRYPOINT ["mvn", "spring-boot:run"]