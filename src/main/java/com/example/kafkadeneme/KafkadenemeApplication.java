package com.example.kafkadeneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkadenemeApplication {

    //docker-compose -f docker-compose.yml up -d
    //https://www.youtube.com/watch?v=dLDDCYAGNpM
    //https://github.com/HaydiKodlayalim/spring-examples
    // postman http://localhost:8080/message {"message": "Test Kuyruk1"}
    public static void main(String[] args) {
        SpringApplication.run(KafkadenemeApplication.class, args);
    }

}
