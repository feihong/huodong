FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/huodong.jar /huodong/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/huodong/app.jar"]
