package com.devops.backend.persistence.repositories;

import com.devops.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marsdev on 8/24/17.
 */
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}