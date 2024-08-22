package com.example.BankApplication.service;

import com.example.BankApplication.models.BankService;
import com.example.BankApplication.repository.BankServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceService {
    @Autowired
    BankServiceRepository bankServiceRepository;
    public List<BankService> findAll() {
        return bankServiceRepository.findAll();
    }
}
