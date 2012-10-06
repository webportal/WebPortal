package com.shevchik.webportal.domain;

import javax.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @ManyToOne
    private User owner;

}
