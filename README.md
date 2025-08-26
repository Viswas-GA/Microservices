# Microservices
A simple Spring Boot microservices project using Spring Cloud Config Server for centralized configuration and Spring Cloud API Gateway as a single entry point to route requests to User and Order services.

This project is a simple Microservices Architecture built using Spring Boot.
It demonstrates how multiple services can work together with the help of Spring Cloud Config Server and Spring Cloud API Gateway.

🔑 Key Features

User Service → A simple microservice that provides user-related information.
Order Service → A simple microservice that provides order-related information.
Spring Cloud Config Server → Centralized configuration management for all microservices (so each service doesn’t need to maintain its own configs locally).
Spring Cloud API Gateway → Single entry point for clients. All requests pass through the gateway and are routed to the correct microservice.

Think of the Config Server as a shared notebook 📓 where you write down all the important settings for your apps.

👉 Instead of every service carrying its own settings (like port number, database info, service name) in local files, they all go to the Config Server to “read” their settings.
Example:
User Service: “Hey Config Server, what’s my port?” → Config Server: “Run on 8081”
Order Service: “What’s my name?” → Config Server: “You are Order Microservice”

Think of the API Gateway as the main gatekeeper 🚦 in front of all your services.
Without a gateway:
👉 Client (like your browser or mobile app) has to remember:
User Service = http://localhost:8081/user/info
Order Service = http://localhost:8082/order/info
That’s confusing 😵.
With an API Gateway:
👉 Client only talks to one address (the gateway), like:
http://localhost:8080/user/info → Gateway forwards to User Service
http://localhost:8080/order/info → Gateway forwards to Order Service
Clients don’t need to know which port each service is running on.Gateway can add extra features like security, logging, or rate limiting.

🚀 How to Run
Start the Config Server (port 8888).
Start the User Service (port 8081).
Start the Order Service (port 8082).
Start the API Gateway (port 8080).
Test APIs via the Gateway:
http://localhost:8080/user/info
http://localhost:8080/order/info
