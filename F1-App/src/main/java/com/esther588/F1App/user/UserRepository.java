package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
