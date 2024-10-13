package com.example.kafka.consumer;

import com.example.kafka.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    private final Logger log = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${order.topic}", groupId = "${order.groupId}")
    public void consume(Order order)  {
        log.info(order.getProductName());
    }
}
