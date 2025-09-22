package io.spring.mongo.jpa.issue.jpa.inheritance;

import org.springframework.stereotype.Repository;

@Repository
public interface ShopperRepository extends EntityRepository<Shopper>{

}
