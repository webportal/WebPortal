package com.shevchik.webportal.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private Set<Item> items = new HashSet<>();


    @OneToMany
    private Set<Category> subCategories = new HashSet<>();

    @ManyToOne
    @Column(name = "parent")
    private Category parentCategory;

}
