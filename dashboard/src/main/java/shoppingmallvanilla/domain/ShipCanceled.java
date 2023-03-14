package shoppingmallvanilla.domain;

import shoppingmallvanilla.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ShipCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemId;
    private Long orderId;
    private String status;
}
