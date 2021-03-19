package com.nal.security.repos;

import com.nal.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nahin on 3/19/2021
 **/

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
