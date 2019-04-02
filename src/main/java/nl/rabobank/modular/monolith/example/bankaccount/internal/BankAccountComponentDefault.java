package nl.rabobank.modular.monolith.example.bankaccount.internal;

import nl.rabobank.modular.monolith.example.bankaccount.BankAccountComponent;
import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class BankAccountComponentDefault implements BankAccountComponent {

    private final BankaccountRepository bankaccountRepository;
    private final BankAccountEntityMapper bankAccountEntityMapper;

    @Override
    public BankAccount getBankAccount(final String bankaccountNumber) {
        return bankaccountRepository.findByBankAccountNumber(bankaccountNumber);
    }

    @Override
    public void save(final BankAccount bankAccount) {
        bankaccountRepository.save(bankAccountEntityMapper.map(bankAccount));
    }
}
