package nl.rabobank.modular.monolith.example;

import nl.rabobank.modular.monolith.example.mortgage.MortgageComponent;
import nl.rabobank.modular.monolith.example.mortgage.domain.BonusRegelingen;
import nl.rabobank.modular.monolith.example.mortgage.domain.CollatoralObject;
import nl.rabobank.modular.monolith.example.mortgage.domain.Income;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.domain.VakantieGeld;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Profile("local")
@Component
@RequiredArgsConstructor
public class BankAccountDbInitializer {

    private final MortgageComponent mortgageComponent;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        initMortgage();
    }

    private void initMortgage() {
        Income incomeEntity = new Income(30000, new VakantieGeld(200), new BonusRegelingen(4000));
        CollatoralObject collatoralObjectEntity = new CollatoralObject("street");
        Mortgage mortgageEntity = new Mortgage("", incomeEntity, collatoralObjectEntity);

        mortgageComponent.save(mortgageEntity);
    }
}
