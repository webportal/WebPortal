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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (owner != null ? !owner.equals(purchase.owner) : purchase.owner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return owner != null ? owner.hashCode() : 0;
    }
}
