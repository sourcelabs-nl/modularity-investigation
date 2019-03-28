package nl.rabobank.c4.cleanexample.bankaccount.internal;

import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class BankAccountComponentDefault implements BankAccountComponent {

    private final BankaccountRepository bankaccountRepository;
    private final BankAccountEntityMapper bankAccountEntityMapper;

    @Override
    public BankAccount getBankaccount(String bankaccountNumber) {
        return bankaccountRepository.findByBankAccountNumber(bankaccountNumber);
    }

    @Override
    public void save(BankAccount bankAccount) {
        bankaccountRepository.save(bankAccountEntityMapper.map(bankAccount));
    }
}
