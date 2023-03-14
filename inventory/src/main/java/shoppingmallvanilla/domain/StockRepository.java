package shoppingmallvanilla.domain;

import shoppingmallvanilla.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="stocks", path="stocks")
public interface StockRepository extends PagingAndSortingRepository<Stock, Long>{

}
