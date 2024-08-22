package com.example.BankApplication.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBranchRequest {

    private String name;
    private String address;
}
