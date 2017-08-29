
package com.devops.test.integration;

import com.devops.DevopsApplication;
import com.devops.backend.persistence.domain.backend.Plan;
import com.devops.backend.persistence.domain.backend.Role;
import com.devops.backend.persistence.domain.backend.User;
import com.devops.backend.persistence.domain.backend.UserRole;
import com.devops.backend.persistence.repositories.PlanRepository;
import com.devops.backend.persistence.repositories.RoleRepository;
import com.devops.backend.persistence.repositories.UserRepository;
import com.devops.enums.PlanEnum;
import com.devops.enums.RoleEnum;
import com.devops.utils.UserUtils;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by dtruong1801 on 8/24/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsApplication.class)
public class RepositoriesIntegrationTest {

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    private static final int BASIC_PLAN_ID = 1;

    @Before
    public void init() {
        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);
    }

    @Test
    public void testCreatedNewPlan() throws Exception {
        Plan basicPlan = createPlan(PlanEnum.BASIC);
        planRepository.save(basicPlan);

        Plan retrievePlan = planRepository.findOne(PlanEnum.BASIC.getId());
        Assert.assertNotNull(retrievePlan);
    }

    @Test
    public void testCreatedNewRole() throws Exception {
        Role userRole = createRole(RoleEnum.BASIC);
        roleRepository.save(userRole);

        Role retrieveRole = roleRepository.findOne(RoleEnum.BASIC.getId());
        Assert.assertNotNull(retrieveRole);
    }

    @Test
    public void createNewUser() throws Exception {

        Plan basicPlan = createPlan(PlanEnum.BASIC);
        planRepository.save(basicPlan);

        User basicUser = UserUtils.createBasicUser();
        basicUser.setPlan(basicPlan);

        Role basicRole = createRole(RoleEnum.BASIC);
        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole(basicUser, basicRole);
        userRoles.add(userRole);

        basicUser.getUserRole().addAll(userRoles);

        for (UserRole ur : userRoles) {
            roleRepository.save(ur.getRole());
        }

        basicUser = userRepository.save(basicUser);
        User newlyCreatedUser = userRepository.findOne(basicUser.getId());
        Assert.assertNotNull(newlyCreatedUser);
        Assert.assertTrue(newlyCreatedUser.getId() != 0);
        Assert.assertNotNull(newlyCreatedUser.getPlan());
        Assert.assertNotNull(newlyCreatedUser.getPlan().getId());
        Set<UserRole> newlyCreatedUserUserRoles = newlyCreatedUser.getUserRole();
        for (UserRole ur : newlyCreatedUserUserRoles) {
            Assert.assertNotNull(ur.getRole());
            Assert.assertNotNull(ur.getRole().getId());
        }
    }

    // Private Methods

    private Plan createPlan(PlanEnum planEnum) {
        Plan plan = new Plan(planEnum);
        return plan;
    }

    private Role createRole(RoleEnum roleEnum) {
        Role role = new Role(roleEnum);
        return role;
    }

}