FROM eclipse-temurin:25

ADD build/libs/starter-0.0.1.jar starter-0.0.1.jar

ENTRYPOINT ["java","-jar","starter-0.0.1.jar"]