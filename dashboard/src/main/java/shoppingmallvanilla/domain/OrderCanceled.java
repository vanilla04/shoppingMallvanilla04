package shoppingmallvanilla.domain;

import shoppingmallvanilla.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemId;
    private Integer qty;
    private String status;
    private String customId;
}
