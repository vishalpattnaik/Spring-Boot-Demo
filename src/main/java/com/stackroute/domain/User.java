package com.stackroute.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    int id;
    String firstName;
    String lastName;
    int age;

}
