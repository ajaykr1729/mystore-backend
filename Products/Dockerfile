#FROM openjdk:19
#EXPOSE 8081
#ADD ./target/Products-1.0-SNAPSHOT-jar-with-dependencies.jar Products-1.0-SNAPSHOT-jar-with-dependencies.jar
#ENTRYPOINT ["java","-jar", "Products-1.0-SNAPSHOT-jar-with-dependencies.jar"]


FROM maven:3.8.7-openjdk-18-slim
WORKDIR /productmodule
COPY ./Products/pom.xml /productmodule
COPY ./Products/src /productmodule/src
RUN mvn package

EXPOSE 8080
CMD ["java", "-jar", "target/Products-1.0-SNAPSHOT-jar-with-dependencies.jar"]
