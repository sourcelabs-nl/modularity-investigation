package nl.rabobank.c4.cleanexample.customer.internal;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.customer.CustomerComponent;
import nl.rabobank.c4.cleanexample.customer.domain.Customer;
import nl.rabobank.c4.cleanexample.mortgage.MortgageComponent;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomerComponentDefault implements CustomerComponent {

    private final BankAccountComponent bankAccountComponent;

    private final MortgageComponent mortgageComponent;

    @Override
    public Customer getCustomer() {
        BankAccount bankaccount = bankAccountComponent.getBankaccount("1234567");
        Mortgage mortgage = mortgageComponent.getMortgages().get(0);

        return new Customer(mortgage, bankaccount);
    }
}
