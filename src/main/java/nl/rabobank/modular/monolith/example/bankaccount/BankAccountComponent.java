package nl.rabobank.modular.monolith.example.bankaccount;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

public interface BankAccountComponent {

    BankAccount getBankAccount(final String bankaccountNumber);

    void save(BankAccount bankAccount);
}
