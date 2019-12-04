FROM java:11
EXPOSE 8000
ADD /target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]