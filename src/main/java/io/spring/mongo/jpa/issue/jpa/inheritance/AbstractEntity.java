package io.spring.mongo.jpa.issue.jpa.inheritance;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntity extends AbstractEntitySansUuid implements Serializable {
    
    @Column(columnDefinition = "CHAR(36)", unique = true)
    protected String uuid;

}
