package com.example.BankApplication;

import com.example.BankApplication.models.BankService;
import com.example.BankApplication.models.Branch;
import com.example.BankApplication.repository.BankServiceRepository;
import com.example.BankApplication.repository.BranchRepository;
import com.example.BankApplication.service.BankServiceService;
import com.example.BankApplication.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LoadDataToDatabase implements CommandLineRunner {

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    BankServiceRepository bankServiceRepository;

    @Override
    public void run(String... args) throws Exception {
        branchRepository.saveAll(Arrays.asList(
                Branch.builder().name("MG Road Branch").address("MG Road, Bangalore").build(),
                Branch.builder().name("Koramangala Branch").address("Koramangala, Bangalore").build(),
                Branch.builder().name("Jayanagar Branch").address("Jayanagar, Bangalore").build(),
                Branch.builder().name("Koramangala Branch").address("Koramangala, Bangalore").build(),
                Branch.builder().name("Indiranagar Branch").address("Indiranagar, Bangalore").build(),
                Branch.builder().name("Whitefield Branch").address("Whitefield Branch").build(),
                Branch.builder().name("HSR Layout Branch").address("HSR Layout Branch").build(),
                Branch.builder().name("Electronic City Branch").address("Electronic City Branch").build(),
                Branch.builder().name("Yelahanka Branch").address("Yelahanka Branch").build(),
                Branch.builder().name("Rajajinagar Branch").address("Rajajinagar, Bangalore").build()
        ));
        bankServiceRepository.saveAll(Arrays.asList(
                BankService.builder().serviceName("Savings Account").description("A bank account that earns interest").build(),
                BankService.builder().serviceName("Current Account").description("A non-interest bearing account").build(),
                BankService.builder().serviceName("Credit Card").description("A card for borrowing funds").build(),
                BankService.builder().serviceName("Loans").description("Personal and Home Loans").build(),
                BankService.builder().serviceName("Fixed Deposits").description("High-interest savings product").build(),
                BankService.builder().serviceName("Insurance").description("Life and Health Insurance policies").build(),
                BankService.builder().serviceName("Wealth Management").description("Investment and portfolio management services").build(),
                BankService.builder().serviceName("Net Banking").description("Online banking services").build(),
                BankService.builder().serviceName("Mobile Banking").description("Banking through mobile app").build(),
                BankService.builder().serviceName("ATM Services").description("Cash withdrawal and deposit").build()
        ));
    }
}
