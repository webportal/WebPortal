package com.shevchik.webportal.domain;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private int size;

    @Column(name = "width")
    private int width;

    @Column(name = "height")
    private int height;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
