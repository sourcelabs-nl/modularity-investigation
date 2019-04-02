package nl.rabobank.modular.monolith.example.mortgage.internal;
import java.util.List;
import java.util.stream.Collectors;

import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.MortgageComponent;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class MortgageComponentDefault implements MortgageComponent {

    private final MortgageRepository mortgageRepository;

    private final MortgageEntityMapper mortgageEntityMapper;

    private final MortgateMapper mortgateMapper;

    @Override
    public List<Mortgage> getMortgages() {
        return mortgageRepository.findAll().stream().map(mortgateMapper::map).collect(Collectors.toList());
    }

    @Override
    public void save(final Mortgage mortgage) {
        mortgageRepository.save(mortgageEntityMapper.map(mortgage));
    }

}
