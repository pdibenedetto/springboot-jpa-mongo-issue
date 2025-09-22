package io.spring.mongo.jpa.issue.jpa.inheritance;

import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntityRepository<E extends AbstractEntity> extends EntitySansUuidRepository<E> {
    Optional<E> findByUuid(String uuid);
}
