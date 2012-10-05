package com.shevchik.webportal.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private Date dateBirth;
    private Date lastVisit;
    private String password;
    private String username;

}
