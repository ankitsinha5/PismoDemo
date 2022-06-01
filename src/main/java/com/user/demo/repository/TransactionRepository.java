package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.entity.Account;
import com.user.demo.entity.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer>{

}
