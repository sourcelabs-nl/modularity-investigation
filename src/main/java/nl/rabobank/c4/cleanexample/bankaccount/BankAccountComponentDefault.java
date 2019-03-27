package nl.rabobank.c4.cleanexample.bankaccount;

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
