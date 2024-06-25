FROM openjdk:17
EXPOSE 8080
ADD target/springboot-java-application.war springboot-java-application.war
ENTRYPOINT ["java","-war","/springboot-java-application.war"]