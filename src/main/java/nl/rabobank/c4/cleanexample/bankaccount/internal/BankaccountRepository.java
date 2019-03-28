package nl.rabobank.c4.cleanexample.bankaccount.internal;

import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

import org.springframework.data.repository.Repository;

interface BankaccountRepository extends Repository<BankAccountEntity, String> {

    BankAccount findByBankAccountNumber(String bankaccountNumber);

    void save(BankAccountEntity bankAccount);
}
