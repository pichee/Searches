FROM eclipse-temurin:21
LABEL maintainer="SERVIÇO"
WORKDIR /aplicacao
COPY target/servicos-0.0.1-SNAPSHOT.jar /aplicacao/servicos-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/aplicacao/servicos-0.0.1-SNAPSHOT.jar"]
