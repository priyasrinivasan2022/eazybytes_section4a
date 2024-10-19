package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountService {
    public void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
