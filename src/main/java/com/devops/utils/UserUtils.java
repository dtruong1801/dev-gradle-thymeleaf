package com.devops.utils;

import com.devops.backend.persistence.domain.backend.User;

/**
 * Created by dtruong1801 on 8/29/17.
 */
public class UserUtils {

    /**
     * Non instantiable
     */
    private UserUtils() {
        throw new AssertionError("Non instantiable");
    }

    /**
     * Create a user with basic attributes set
     * @return A User entity
     */
    public static User createBasicUser() {

        User user = new User();
        user.setUsername("basicUser");
        user.setPassword("secrete");
        user.setEmail("me@example.com");
        user.setFirstName("firstname");
        user.setLastName("lastname");
        user.setPhoneNumber("121212121221");
        user.setCountry("usa");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.getProfileImagesUrl("https://devops.com/basicUser");

        return user;
    }
}


