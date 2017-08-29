package com.devops.backend.persistence.domain.backend;

import com.devops.enums.PlanEnum;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dtruong1801 on 8/22/17.
 */
@Entity
public class Plan implements Serializable {

    /** The Serial Version UID for Serializable classes */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    /** Default constructor */
    public Plan() {

    }

    /**
     * Full constructor
     * @param planEnum
     */
    public Plan(PlanEnum planEnum) {
        this.id = planEnum.getId();
        this.name = planEnum.getPlanName();
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

        Plan plan = (Plan) o;

        return id == plan.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
