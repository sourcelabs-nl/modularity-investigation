package nl.rabobank.c4.cleanexample;

import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.mortgage.domain.CollatoralObject;
import nl.rabobank.c4.cleanexample.mortgage.domain.VakantieGeld;
import nl.rabobank.c4.cleanexample.mortgage.domain.Income;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;
import nl.rabobank.c4.cleanexample.mortgage.MortgageComponent;
import nl.rabobank.c4.cleanexample.mortgage.domain.BonusRegelingen;

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
        initBankAccounts();
        initMortgage();
    }

    private void initBankAccounts() {
        bankAccountComponent.save(new BankAccount("1234567", "koehler", "ad"));
        bankAccountComponent.save(new BankAccount("1234568", "koehler", "dm"));
        bankAccountComponent.save(new BankAccount("1234569", "koehler", "caj"));
    }

    void initMortgage() {
        Income incomeEntity = new Income(30000, new VakantieGeld(200), new BonusRegelingen(4000));
        CollatoralObject collatoralObjectEntity = new CollatoralObject("street");
        Mortgage mortgageEntity = new Mortgage("", incomeEntity, collatoralObjectEntity);

        mortgageComponent.save(mortgageEntity);
    }

}
