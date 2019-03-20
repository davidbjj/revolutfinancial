package revolut.example.dao;

import revolut.example.com.exception.CustomException;
import revolut.example.com.model.Account;
import revolut.example.com.model.UserTransaction;

import java.math.BigDecimal;
import java.util.List;


public interface AccountDAO {

    List<Account> getAllAccounts() throws CustomException;
    Account getAccountById(long accountId) throws CustomException;
    long createAccount(Account account) throws CustomException;
    int deleteAccountById(long accountId) throws CustomException;

    int updateAccountBalance(long accountId, BigDecimal deltaAmount) throws CustomException;
    int transferAccountBalance(UserTransaction userTransaction) throws CustomException;
}
