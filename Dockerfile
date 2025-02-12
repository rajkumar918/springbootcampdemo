FROM openjdk:17
COPY ./target/demo-0.0.1-SNAPSHOT.jar ./demo-0.0.1-SNAPSHOT.jar
EXPOSE 8899
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]