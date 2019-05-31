# SpringBoot microservice archetype
 
Java 8 SpringBoot Archetype

Include : 

Controller, Service, Repository , Healthcheck, RestExceptionHandler, AopLogging , Basic Configs, Test and a Dockerfile.
Also include a docker-compose archive with a mysql image for more examples.

Folders: 

Rest , Service, Repository , Domain and Config

## Installation 

```bash
 git clone https://github.com/jesur32/springboot-microservice.git 
 cd springboot-microservice
 mvn spring-boot:run 
``` 

## Installation with Docker

Download Docker https://www.docker.com

```bash
 git clone https://github.com/jesur32/springboot-microservice.git 
 cd springboot-microservice
 mvn clean install
 docker build . -t springboot-microservice  
 docker run -e PORT=8080 -p 8081:8080 -d springboot-microservice  
```  

## Installation with Docker Compose

Download Docker and Docker Compose https://www.docker.com

```bash
 git clone https://github.com/jesur32/springboot-microservice.git 
 cd springboot-microservice
 docker-compose build
 docker-compose up -d
 
``` 



Routes

- http://localhost:8081/jesu/healthcheck
- http://localhost:8081/jesu/hello
