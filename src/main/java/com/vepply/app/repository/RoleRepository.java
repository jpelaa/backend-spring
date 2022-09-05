package com.vepply.app.repository;

import com.vepply.app.model.ERole;
import com.vepply.app.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
