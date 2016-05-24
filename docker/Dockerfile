FROM java:8-jre-alpine
MAINTAINER  Pierrick Puimean-Chieze
VOLUME /tmp
ADD ourmemory-server-0.0.1-SNAPSHOT.jar ourmemory-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=production", "-jar","/ourmemory-server.jar"]