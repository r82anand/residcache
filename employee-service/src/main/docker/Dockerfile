FROM java:8
VOLUME /tmp
ADD employee-service-0.0.1-SNAPSHOT.jar /opt/employee-service-1.0-RELEASE.jar
RUN bash -c 'touch /opt/employee-service-1.0-RELEASE.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/employee-service-1.0-RELEASE.jar"]
