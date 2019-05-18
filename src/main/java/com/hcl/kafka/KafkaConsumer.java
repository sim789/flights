package com.hcl.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    
    

    @KafkaListener(topics = "oam4ddja-flights")
    public void jobSearchFlights(String message){
        logger.info("received content = '{}'", message);
    }
    
}