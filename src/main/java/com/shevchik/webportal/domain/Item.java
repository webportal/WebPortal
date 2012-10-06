package com.shevchik.webportal.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany
    private Set<Image> images = new HashSet<>();

    @ManyToMany(mappedBy = "items")
    private Set<Category> category = new HashSet<Category>();

    @ManyToMany
    @JoinTable(name = "items",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> likedByUsers;


    @ManyToMany(mappedBy = "items")
    private Set<Order> orders = new HashSet<Order>();
}
