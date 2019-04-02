package nl.rabobank.modular.monolith.example.bankaccount.internal;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

import org.springframework.data.repository.Repository;

interface BankaccountRepository extends Repository<BankAccountEntity, String> {

    BankAccount findByBankAccountNumber(String bankaccountNumber);

    void save(BankAccountEntity bankAccount);
}
