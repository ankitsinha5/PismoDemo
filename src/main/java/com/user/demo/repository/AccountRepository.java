package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
