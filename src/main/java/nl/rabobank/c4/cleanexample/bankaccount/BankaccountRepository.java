package nl.rabobank.c4.cleanexample.bankaccount;

import org.springframework.data.repository.Repository;

interface BankaccountRepository extends Repository<BankAccountEntity, String> {

    BankAccount findByBankAccountNumber(String bankaccountNumber);

    void save(BankAccountEntity bankAccount);
}
