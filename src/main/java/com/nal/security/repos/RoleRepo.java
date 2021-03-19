package com.nal.security.repos;

import com.nal.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nahin on 3/19/2021
 **/
public interface RoleRepo extends JpaRepository<Role, Long> {
}
