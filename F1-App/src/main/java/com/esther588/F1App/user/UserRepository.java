package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
