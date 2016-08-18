package com.ecommerce.model;

import javax.persistence.*;

/**
 * Created by Alx on 8/18/2016.
 */
@Entity
@Table(name = "authorities")
public class Authorities {

    @Id
    @GeneratedValue
    @Column(name = "authoritiesId")
    private int authoritiesId;

    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;

    public int getAuthoritiesId() {
        return authoritiesId;
    }

    public void setAuthoritiesId(int authoritiesId) {
        this.authoritiesId = authoritiesId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
