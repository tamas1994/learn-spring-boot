package com.folkcat.learnspringboot.repository;

import com.folkcat.learnspringboot.bean.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Tamas on 2017/6/27.
 */
public interface UserRepository extends JpaRepository<User2, Long> {
    User2 findByName(String name);
    User2 findByNameAndAge(String name, Integer age);
    @Query("from User2 u where u.name=:name")
    User2 findUser(@Param("name") String name);
}
