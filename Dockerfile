FROM openjdk:21

# Install the application dependencies
EXPOSE 9901
ADD target\demo.jar demo.jar

CMD ["java","-jar","demo.jar"]