FROM openjdk:24-jdk-bookworm
WORKDIR /home/test/
COPY web-0.0.1.jar /home/test/

EXPOSE 80 
CMD ["/usr/local/openjdk-24/bin/java", "-jar", "/home/test/web-0.0.1.jar"]