FROM openjdk:8
WORKDIR /usr/local
COPY ./target/test.jar ./
EXPOSE 8080
CMD ["java","-jar","test.jar"]