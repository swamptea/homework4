package ru.netology.dbhw4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persons {

    public Persons() {
    }

    @Id
    @Column(nullable = false, length = 20)
    private String name;
    @Id
    @Column(nullable = false, length = 20)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(length = 10)
    private String phone_number;
    @Column(nullable = false, length = 20)
    private String city_of_living;
}
