package com.shevchik.webportal.domain;

import javax.persistence.*;

@Entity
@Table(name = "orders_items")
public class OrderItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "quantity")
    private int quantity;

}
