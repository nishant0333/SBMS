package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;
import com.example.entity.AccountPk;

public interface AccountRepo extends JpaRepository<Account, AccountPk> {

}