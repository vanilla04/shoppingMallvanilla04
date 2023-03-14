package shoppingmallvanilla.domain;

import shoppingmallvanilla.domain.*;
import shoppingmallvanilla.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemId;
    private Integer qty;
    private String status;
    private String customId;
}


