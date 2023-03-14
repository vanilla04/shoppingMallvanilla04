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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_문자메세지를발송(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener 문자메세지를발송 : " + ordered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_문자메세지를발송(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener 문자메세지를발송 : " + orderCanceled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ShipCanceled'")
    public void wheneverShipCanceled_문자메세지를발송(@Payload ShipCanceled shipCanceled){

        ShipCanceled event = shipCanceled;
        System.out.println("\n\n##### listener 문자메세지를발송 : " + shipCanceled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipped'")
    public void wheneverShipped_문자메세지를발송(@Payload Shipped shipped){

        Shipped event = shipped;
        System.out.println("\n\n##### listener 문자메세지를발송 : " + shipped + "\n\n");


        

        // Sample Logic //

        

    }

}


