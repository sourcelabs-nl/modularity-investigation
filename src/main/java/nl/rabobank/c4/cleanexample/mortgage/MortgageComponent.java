package nl.rabobank.c4.cleanexample.mortgage;
import java.util.List;

import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

public interface MortgageComponent {
    List<Mortgage> getMortgages();

    void init();
}
