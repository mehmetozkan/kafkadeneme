package com.example.kafkadeneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkadenemeApplication {

    //docker-compose -f docker-compose1.yml up -d
    //docker-kafka -f docker-kafka.yml up -d
    //docker-compose -f docker-kafka.yml up -d
    //https://www.youtube.com/watch?v=dLDDCYAGNpM
    //https://github.com/HaydiKodlayalim/spring-examples
    // postman http://localhost:8080/message {"message": "Test Kuyruk1"}

    //docker-compose -f <docker-compose_file_name> up -d
    public static void main(String[] args) {
        SpringApplication.run(KafkadenemeApplication.class, args);
    }

}
