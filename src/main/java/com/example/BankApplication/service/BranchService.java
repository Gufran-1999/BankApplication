package com.example.BankApplication.service;

import com.example.BankApplication.models.Branch;
import com.example.BankApplication.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    BranchRepository branchRepository;
    public List<Branch> findAll(){
        return branchRepository.findAll();
    }

}
