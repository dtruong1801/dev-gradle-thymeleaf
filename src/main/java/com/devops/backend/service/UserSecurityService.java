package com.devops.backend.service;

import com.devops.backend.persistence.domain.backend.User;
import com.devops.backend.persistence.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by dtruong1801 on 8/29/17.
 */
@Service
public class UserSecurityService implements UserDetailsService {

    /** the application logger */
    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserRepository userRepository;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (null == user) {
            LOG.warn("Username {} no found", username);
            throw new UsernameNotFoundException(("username " + username + " not found"));
        }
        return user;
    }

}
