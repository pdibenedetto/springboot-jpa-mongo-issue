package io.spring.mongo.jpa.issue.jpa.inheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntitySansUuidRepository<E extends AbstractEntitySansUuid>
        extends JpaRepository<E, Long>, JpaSpecificationExecutor<E> {
}
