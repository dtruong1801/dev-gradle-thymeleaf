package com.devops.backend.persistence.domain.backend;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dtruong1801 on 8/29/17.
 */
@Entity
@Table(name = "user-role")
public class UserRole implements Serializable {

    /** The Serial Version UID for Serializable classes */
    private static final long serialVersionUID = 1L;


    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Role role;


    /** Default contructor */
    public UserRole() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (user != null ? !user.equals(userRole.user) : userRole.user != null) return false;
        return role != null ? role.equals(userRole.role) : userRole.role == null;

    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
