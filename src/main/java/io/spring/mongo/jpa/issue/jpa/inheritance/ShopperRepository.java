package io.spring.mongo.jpa.issue.jpa.inheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface ShopperRepository extends EntityRepository<Shopper>{
//
//}

public interface ShopperRepository extends JpaRepository<Shopper, Long> {

}
