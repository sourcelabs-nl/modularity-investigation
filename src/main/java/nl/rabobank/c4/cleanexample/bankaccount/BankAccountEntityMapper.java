package nl.rabobank.c4.cleanexample.bankaccount;

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
