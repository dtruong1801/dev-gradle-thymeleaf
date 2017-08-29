package com.devops.backend.persistence.domain.backend;

import com.devops.enums.RoleEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dtruong1801 on 8/29/17.
 */
@Entity
public class Role implements Serializable {

    /** The Serial Version UID for Serializable classes */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    /** Default controller */
    public Role() {

    }

    public Role(RoleEnum roleEnum) {
        id = roleEnum.getId();
        name = roleEnum.getRoleName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        return id == role.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
