package com.projectkafka.javakafka;

import com.projectkafka.javakafka.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private KafkaTemplate<String, Produto> kafkaTemplate;

    @GetMapping("/produto/{message}/{name}")
    public void producer(@PathVariable String message,
                         @PathVariable String name){
        Produto produto = new Produto(message, name);
        this.kafkaTemplate.send("ecommerce-cliente2", produto);
    }
}
