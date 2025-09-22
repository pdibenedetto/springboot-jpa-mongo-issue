package io.spring.mongo.jpa.issue.jpa;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    @Column()
    private String firstName;

    @Column()
    private String lastName;
}
