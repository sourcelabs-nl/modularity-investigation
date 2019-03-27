package nl.rabobank.c4.cleanexample.mortgage;
import java.util.List;
import java.util.stream.Collectors;

import nl.rabobank.c4.cleanexample.mortgage.domain.CollatoralObject;
import nl.rabobank.c4.cleanexample.mortgage.domain.Income;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class MortgageComponentDefault implements MortgageComponent {

    private final MortgageRepository mortgageRepository;

    @Override
    public List<Mortgage> getMortgages() {
        return mortgageRepository.findAll().stream().map(this::map).collect(Collectors.toList());
    }

    public void init() {
        MortgageEntity mortgageEntity = new MortgageEntity();
        CollatoralObjectEntity collatoralObjectEntity = new CollatoralObjectEntity();
        collatoralObjectEntity.setName("huis");
        mortgageEntity.setCollatoralObjectEntity(collatoralObjectEntity);
        IncomeEntity incomeEntity = new IncomeEntity();
        incomeEntity.setIncome(300);
        mortgageEntity.setIncomeEntity(incomeEntity);
        mortgageRepository.save(mortgageEntity);
    }

    private Mortgage map(MortgageEntity mortgageEntity) {
        Income income = new Income(mortgageEntity.getIncomeEntity().getIncome());
        CollatoralObject collatoralObject = new CollatoralObject(mortgageEntity.getCollatoralObjectEntity().getName());
        return new Mortgage(mortgageEntity.getId().toString(), income, collatoralObject);

    }
}
