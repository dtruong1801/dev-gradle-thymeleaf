package com.devops.enums;

/**
 * Created by dtruong1801 on 8/25/17.
 */
public enum RoleEnum {

    BASIC(1, "ROLE_BASIC"),
    PRO(2, "ROLE_PROP"),
    ADMIN(3, "ROLE_ADMIN");

    private final int id;

    private final String roleName;

    RoleEnum(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() { return id; }

    public String getRoleName() { return roleName; }
}