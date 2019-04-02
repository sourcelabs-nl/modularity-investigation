package nl.rabobank.modular.monolith.example.mortgage;
import java.util.List;

import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;

public interface MortgageComponent {
    List<Mortgage> getMortgages();

    void save(Mortgage mortgage);
}
