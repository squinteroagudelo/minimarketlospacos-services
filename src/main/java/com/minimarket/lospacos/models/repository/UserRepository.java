package com.minimarket.lospacos.models.repository;

import com.minimarket.lospacos.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
