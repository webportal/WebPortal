package com.shevchik.webportal.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
    private long id;
    private String name;
    private int size;
    private int width;
    private int height;
    private String description;

    @ManyToOne
    private Item item;
}
