FROM java:17

ADD login-0.0.1-SNAPSHOT.jar login-0.0.1.jar

EXPOSE 8081

RUN bash -c 'touch /login-0.0.1.jar'

ENTRYPOINT ["java","-jar","login-0.0.1.jar"]

