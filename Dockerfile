FROM openjdk:8u111-jre-alpine
#//8081 포트를 연다 - Listening 하게 만든다.
#//이렇게 해도 바로 접근이 가능한것은 아니고 docker run 에서 -p 옵션을 써줘야 가능함.
#//docker run 할때 추가적인 포트 포워딩이 필요하다는 뜻
#EXPOSE 8081
ARG JAR_FILE=build/libs/*.jar
COPY $JAR_FILE app.jar
ENTRYPOINT ["java","-jar","app.jar","--server.port=8081"]
