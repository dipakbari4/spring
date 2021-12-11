package com.dipak.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dipak.spring.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
