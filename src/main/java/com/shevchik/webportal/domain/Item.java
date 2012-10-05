package com.shevchik.webportal.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "items")
public class Item {
    private long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String telephone;

    @OneToMany
    private Set<Image> images = new HashSet<>();

    @ManyToOne
    private Category category;
}
