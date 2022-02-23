package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.Accesslevel;
import com.epam.spring.service.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsById(int id);

    User findById(int id);

    List<User> findByEmail(String email);

    List<User> findByAccesslevel(Accesslevel accesslevel);

    List<User> findAll(Sort sort);
}
