FROM adoptopenjdk/openjdk11:alpine-jre
LABEL "name"="evraz"
ARG JAR_FILE=target/evraz-0.0.1-SNAPSHOT.jar
ARG CERT="CA.pem"
WORKDIR /opt/app
COPY $CERT /opt/app/
RUN keytool -importcert -file $CERT -alias $CERT -cacerts -storepass changeit -noprompt
COPY ${JAR_FILE} app.jar



ENTRYPOINT ["java","-jar","app.jar"]