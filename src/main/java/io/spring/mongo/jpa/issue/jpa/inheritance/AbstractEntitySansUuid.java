package io.spring.mongo.jpa.issue.jpa.inheritance;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntitySansUuid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
}
