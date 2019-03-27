package nl.rabobank.c4.cleanexample;

import nl.rabobank.c4.cleanexample.bankaccount.BankAccount;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.mortgage.MortgageComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class CleanExampleApplication {

    private final BankAccountComponent bankAccountComponent;

    private final MortgageComponent mortgageComponent;

    public static void main(String[] args) {
        SpringApplication.run(CleanExampleApplication.class, args);
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        bankAccountComponent.save(new BankAccount("1234567", "koehler", "ad"));
        bankAccountComponent.save(new BankAccount("1234568", "koehler", "dm"));
        bankAccountComponent.save(new BankAccount("1234569", "koehler", "caj"));

        mortgageComponent.init();
    }

}
