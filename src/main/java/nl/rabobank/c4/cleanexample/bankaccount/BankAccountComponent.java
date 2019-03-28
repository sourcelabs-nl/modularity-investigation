package nl.rabobank.c4.cleanexample.bankaccount;

import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

public interface BankAccountComponent {

    BankAccount getBankaccount(String bankaccountNumber);

    void save(BankAccount bankAccount);
}
