package com.devops.backend.persistence.repositories;

import com.devops.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dtruong1801 on 8/24/17.
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
}