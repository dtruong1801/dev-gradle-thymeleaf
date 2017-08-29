package com.devops.enums;

/**
 * Created by dtruong1801 on 8/25/17.
 */
public enum PlanEnum {

    BASIC(1, "Basic"),
    PRO(2, "Pro");

    private final int id;

    private final String planName;

    PlanEnum(int id, String planName) {
        this.id = id;
        this.planName = planName;
    }

    public int getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }
}
