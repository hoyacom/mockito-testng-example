package com.hoyajjang.example.mockito.verify;

public interface AccountManager {

	long getBalance(Account account);

	long withdraw(Account account, long amount);

	Account findAccount(Customer customer);

}
