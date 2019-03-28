package nl.rabobank.c4.cleanexample.bankaccount.internal;

import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

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
