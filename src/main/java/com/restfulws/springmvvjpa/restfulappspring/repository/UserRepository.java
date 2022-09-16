package com.restfulws.springmvvjpa.restfulappspring.repository;

import com.restfulws.springmvvjpa.restfulappspring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
    UserEntity findByEmail(String email);
    UserEntity findByUserId(String userId);
}
