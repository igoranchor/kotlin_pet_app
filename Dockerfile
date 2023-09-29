FROM eclipse-temurin:17.0.1_12-jdk-focal

ARG APP_HOME=/app

WORKDIR $APP_HOME

EXPOSE 8080

COPY target/prm-pay.jar $APP_HOME/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
