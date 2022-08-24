package com.zshrimp2.myhome.repository;

import com.zshrimp2.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
