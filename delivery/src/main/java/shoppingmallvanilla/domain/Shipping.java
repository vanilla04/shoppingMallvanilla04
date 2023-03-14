package shoppingmallvanilla.domain;

import shoppingmallvanilla.domain.Shipped;
import shoppingmallvanilla.domain.ShipCanceled;
import shoppingmallvanilla.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Shipping_table")
@Data

public class Shipping  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String itemId;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        Shipped shipped = new Shipped(this);
        shipped.publishAfterCommit();



        ShipCanceled shipCanceled = new ShipCanceled(this);
        shipCanceled.publishAfterCommit();

    }

    public static ShippingRepository repository(){
        ShippingRepository shippingRepository = DeliveryApplication.applicationContext.getBean(ShippingRepository.class);
        return shippingRepository;
    }




    public static void ship(Ordered ordered){

        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

        
    }
    public static void shipCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

        
    }


}
