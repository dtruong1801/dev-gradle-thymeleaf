package com.devops.backend.persistence.repositories;

import com.devops.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dtruong1801 on 8/29/17.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer>{
}
