package com.shevchik.webportal.domain;

import javax.persistence.*;
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
    private Date lastVisit;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @ManyToMany(mappedBy = "likedByUsers")
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Item> getFavouriteItems() {
        return favouriteItems;
    }

    public void setFavouriteItems(Set<Item> favouriteItems) {
        this.favouriteItems = favouriteItems;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Set<Image> getAvatars() {
        return avatars;
    }

    public void setAvatars(Set<Image> avatars) {
        this.avatars = avatars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (dateBirth != null ? !dateBirth.equals(user.dateBirth) : user.dateBirth != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (lastVisit != null ? !lastVisit.equals(user.lastVisit) : user.lastVisit != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dateBirth != null ? dateBirth.hashCode() : 0);
        result = 31 * result + (lastVisit != null ? lastVisit.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
