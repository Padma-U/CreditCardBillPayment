FROM openjdk:8
WORKDIR /app
ADD build/libs/CreditCardPayment-0.0.1-SNAPSHOT.jar .
EXPOSE 8086
ENTRYPOINT ["java","-jar","CreditCardPayment-0.0.1-SNAPSHOT.jar"]
