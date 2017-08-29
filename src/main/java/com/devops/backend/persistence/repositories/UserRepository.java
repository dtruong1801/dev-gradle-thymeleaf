package com.devops.backend.persistence.repositories;

import com.devops.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dtruong1801 on 8/24/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
