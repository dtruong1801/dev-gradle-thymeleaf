package com.devops.backend.persistence.domain.backend;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by dtruong1801 on 8/29/17.
 */
public class Authority implements GrantedAuthority {

    private final String authority;


    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}

