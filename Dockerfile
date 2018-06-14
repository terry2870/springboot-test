FROM teradatalabs/centos6-java8-oracle

COPY run/target/springboot-test-run-1.0.0-SNAPSHOT.jar /opt/springboot-test-run-1.0.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/opt/springboot-test-run-1.0.0-SNAPSHOT.jar"]
EXPOSE 8081
