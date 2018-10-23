package com.priyanka.app.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.app.ws.io.entity.UserEntity;

@Repository // to make it a repository
public interface UserRepository extends CrudRepository<UserEntity, Long> { // class of obj that needs to be persistant
	UserEntity findByEmail(String email);
}
