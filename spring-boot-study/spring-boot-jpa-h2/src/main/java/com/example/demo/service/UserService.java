package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * @Description:
 * @author: Alan
 * @Date: 2018/12/1 11:44
 */
public interface UserService {

    /****************************create*****************************************/
    User save(User user);
    /****************************read*****************************************/
    List<User> findByAndSort(String lastName, Sort sort);

    User findByIdCard(String idCard);

    User findByIdCard2(String idCard);

    User findByIdCard3(String idCard);

    Page<User> findByLastNameWithPageable(String lastName, Pageable pageable);

    List<User> findByFirstNameOrLastName(String firstName, String lastName);

    List<User> findByDateOfBirth(@Param("date") LocalDate date);

    List<User> findAll(Sort sort);
    /*****************************update****************************************/
    int updateUser(String firstName, String idCard);
    /*****************************delete****************************************/
    void deleteByIdCard(String idCard);

    void deleteByIdCard2(String idCard);

    void deleteById(Long id);

}