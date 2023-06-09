package shoppingmallvanilla.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import shoppingmallvanilla.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoppingmallvanilla.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired ShippingRepository shippingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_Ship(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener Ship : " + ordered + "\n\n");


        

        // Sample Logic //
        Shipping.ship(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_ShipCancel(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener ShipCancel : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Shipping.shipCancel(event);
        

        

    }

}


