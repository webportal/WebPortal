package com.shevchik.webportal.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    private long id;
    private String name;

    @OneToMany
    private Set<Item> items = new HashSet<>();


    @OneToMany
    private Set<Category> subCategories = new HashSet<>();

    @ManyToOne
    private Category parentCategory;

}
