package com.devops.test.integration;

import com.devops.DevopsApplication;
import com.devops.backend.persistence.domain.backend.Plan;
import com.devops.backend.persistence.domain.backend.Role;
import com.devops.backend.persistence.domain.backend.User;
import com.devops.backend.persistence.repositories.PlanRepository;
import com.devops.backend.persistence.repositories.RoleRepository;
import com.devops.backend.persistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dtruong1801 on 8/29/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsApplication.class)
public class RepositoriesIntegrationTest {


    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    private static final int BASIC_PLAN_ID = 1;
    private static final int BASIC_ROLE_ID = 1;

    @Before
    public void init() {
        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);
    }

    @Test
    public void testCreatedNewPlan() throws Exception {
        Plan basicPlan = createBasicPlan();
        planRepository.save(basicPlan);
        Plan retrievePlan = planRepository.findOne(BASIC_PLAN_ID);
        Assert.assertNotNull(retrievePlan);
    }

    @Test
    public void testCreatedNewRole() throws Exception {
        Role userRole = createBasicRole();
        roleRepository.save(userRole);

        Role retrieveRole = roleRepository.findOne(BASIC_ROLE_ID);
        Assert.assertNotNull(retrieveRole);
    }

    // Private Methods

    private Plan createBasicPlan() {
        Plan plan = new Plan();
        plan.setId(BASIC_PLAN_ID);
        plan.setName("Basic");
        return plan;
    }

    private Role createBasicRole() {
        Role role = new Role();
        role.setId(BASIC_ROLE_ID);
        role.setName("ROLE_USER");
        return role;
    }

    private User createBasicUser() {
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
        user.setProfileImagesUrl("https://devops.com/basicUser");

        return user;
    }
}
