package com.shevchik.webportal.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dateBirth")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Column(name = "lastVisit")
    @Temporal(TemporalType.TIME)
    private Time lastVisit;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @ManyToMany(mappedBy = "users")
    private Set<Item> favouriteItems = new HashSet<Item>();


    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<Order> orders = new HashSet<>();


    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<Item> items = new HashSet<>();


    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<Purchase> purchases = new HashSet<Purchase>();

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<Image> avatars = new HashSet<Image>();
}
