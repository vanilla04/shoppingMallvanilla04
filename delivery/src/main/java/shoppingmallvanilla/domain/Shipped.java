package shoppingmallvanilla.domain;

import shoppingmallvanilla.domain.*;
import shoppingmallvanilla.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemId;
    private Long orderId;
    private String status;

    public Shipped(Shipping aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
