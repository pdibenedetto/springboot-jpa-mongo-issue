package io.spring.mongo.jpa.issue.jpa.inheritance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Shopper extends AbstractEntity {

    @Column()
    private String fullName;
}
