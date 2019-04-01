package nl.rabobank.c4.cleanexample;

import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Profile("local")
@Component
@RequiredArgsConstructor
public class MortgageDbInitializer {

    private final BankAccountComponent bankAccountComponent;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        initBankAccounts();
    }

    private void initBankAccounts() {
        bankAccountComponent.save(new BankAccount("1234567", "koehler", "ad"));
        bankAccountComponent.save(new BankAccount("1234568", "koehler", "dm"));
        bankAccountComponent.save(new BankAccount("1234569", "koehler", "caj"));
    }
}
