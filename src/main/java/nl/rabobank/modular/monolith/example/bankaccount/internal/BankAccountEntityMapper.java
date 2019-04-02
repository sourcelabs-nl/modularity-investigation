package nl.rabobank.modular.monolith.example.bankaccount.internal;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

import org.springframework.stereotype.Component;

@Component
class BankAccountEntityMapper {

    BankAccountEntity map(BankAccount bankAccount) {
        BankAccountEntity bankAccountEntity = new BankAccountEntity();
        bankAccountEntity.setBankAccountNumber(bankAccount.getBankAccountNumber());
        bankAccountEntity.setLastName(bankAccount.getLastName());
        bankAccountEntity.setInitals(bankAccount.getInitals());
        return bankAccountEntity;
    }
}
