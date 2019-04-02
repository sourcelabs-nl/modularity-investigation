package nl.rabobank.modular.monolith.example.mortgage.internal;
import nl.rabobank.modular.monolith.example.mortgage.domain.CollatoralObject;
import nl.rabobank.modular.monolith.example.mortgage.domain.VakantieGeld;
import nl.rabobank.modular.monolith.example.mortgage.domain.Income;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.domain.BonusRegelingen;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MortgateMapper {

    Mortgage map(MortgageEntity mortgageEntity) {
        Income income = new Income(mortgageEntity.getIncomeEntity().getIncome(), new VakantieGeld(1100), new BonusRegelingen(1300));
        CollatoralObject collatoralObject = new CollatoralObject(mortgageEntity.getCollatoralObjectEntity().getName());
        return new Mortgage(mortgageEntity.getId().toString(), income, collatoralObject);
    }
}
