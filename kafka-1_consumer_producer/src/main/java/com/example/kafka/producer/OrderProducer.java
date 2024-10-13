package com.example.kafka.producer;

import com.example.kafka.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${order.topic}")
    private String ORDER_TOPIC;

    @Autowired
    public OrderProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void order(Order order){
        kafkaTemplate.send(ORDER_TOPIC,order);
    }

}


