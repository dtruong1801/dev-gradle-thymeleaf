package com.devops.test.integration;

import com.devops.DevopsApplication;
import com.devops.backend.persistence.domain.backend.Role;
import com.devops.backend.persistence.domain.backend.User;
import com.devops.backend.persistence.domain.backend.UserRole;
import com.devops.backend.service.UserService;
import com.devops.enums.PlanEnum;
import com.devops.enums.RoleEnum;
import com.devops.utils.UserUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dtruong1801 on 8/25/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsApplication.class)
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreateNewUSer() throws Exception {

        Set<UserRole> userRoles = new HashSet<>();
        User basicUser = UserUtils.createBasicUser();
        userRoles.add(new UserRole(basicUser, new Role(RoleEnum.BASIC)));

        User user = userService.createUser(basicUser, PlanEnum.BASIC, userRoles);
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());
    }

}
