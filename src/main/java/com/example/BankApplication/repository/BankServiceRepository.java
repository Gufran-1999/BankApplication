package com.example.BankApplication.repository;

import com.example.BankApplication.models.BankService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankServiceRepository extends JpaRepository<BankService,Integer> {
}
