package com.projectkafka.javakafka;

import com.projectkafka.javakafka.model.Produto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;



@Component
public class Consumer {

    @KafkaListener(topics = "ecommerce.cliente2", groupId = "ecommerce-groupId")
    public void consumer(Produto produto){
        System.out.println(produto.getMessage() + " " + produto.getName());
    }
}

