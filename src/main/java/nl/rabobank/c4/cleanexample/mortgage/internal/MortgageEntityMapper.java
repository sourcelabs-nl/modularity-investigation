package nl.rabobank.c4.cleanexample.mortgage.internal;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MortgageEntityMapper {

    MortgageEntity map(Mortgage mortgage) {
        MortgageEntity mortgageEntity = new MortgageEntity();
        mortgageEntity.setIncomeEntity(getIncome(mortgage));
        mortgageEntity.setCollatoralObjectEntity(getCollatoralObject(mortgage));
        return mortgageEntity;
    }

    private CollatoralObjectEntity getCollatoralObject(final Mortgage mortgage) {
        CollatoralObjectEntity collatoralObjectEntity = new CollatoralObjectEntity();
        collatoralObjectEntity.setName(mortgage.getCollatoralObject().getAddress());
        return collatoralObjectEntity;
    }

    private IncomeEntity getIncome(final Mortgage mortgage) {
        IncomeEntity incomeEntity = new IncomeEntity();
        incomeEntity.setIncome(mortgage.getIncome().getAmount());
        return incomeEntity;
    }
}
