package com.yyf.learnseataaccount.service;

/**
 * description
 *
 * @author YYF 2024/10/16 2024/10/16.
 */
public interface AccountService {

    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);
}
