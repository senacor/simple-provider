FROM adoptopenjdk/openjdk11:jre-11.0.10_9-alpine


RUN mkdir /app
COPY target/com.senacor.ci.simple-provider.jar /app/
COPY launch.sh /app/

EXPOSE 8080

WORKDIR /app
CMD ["bash", "launch.sh"]
