package shoppingmallvanilla.domain;

import shoppingmallvanilla.domain.*;
import shoppingmallvanilla.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
}


