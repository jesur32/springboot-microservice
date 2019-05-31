# SpringBoot microservice archetype
 
Java 8 SpringBoot Archetype

Include : 

Controller, Service, Repository , Healthcheck, RestExceptionHandler, AopLogging , Basic Configs, Test and a Dockerfile

Folders: 

Rest , Service, Repository , Domain and Config

## Installation 

```bash
 git clone https://github.com/jesur32/springboot-microservice.git 
 cd springboot-microservice
 mvn spring-boot:run 
``` 

## Installation with Docker https://www.docker.com

Download Docker https://www.docker.com

```bash
 git clone https://github.com/jesur32/springboot-microservice.git 
 cd springboot-microservice
 mvn clean install
 docker build . -t springboot-microservice  
 docker run -e PORT=8080 -p 8081:8080 -d springboot-microservice  
 
``` 

Routes

- http://localhost:8080/jesu/healthcheck
- http://localhost:8080/jesu/hello
