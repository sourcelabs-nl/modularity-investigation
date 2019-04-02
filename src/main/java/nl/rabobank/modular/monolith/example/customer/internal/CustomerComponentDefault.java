package nl.rabobank.modular.monolith.example.customer.internal;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.bankaccount.BankAccountComponent;
import nl.rabobank.modular.monolith.example.customer.CustomerComponent;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.mortgage.MortgageComponent;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomerComponentDefault implements CustomerComponent {

    private final BankAccountComponent bankAccountComponent;

    private final MortgageComponent mortgageComponent;

    @Override
    public Customer getCustomer() {
        BankAccount bankaccount = bankAccountComponent.getBankAccount("1234567");
        Mortgage mortgage = mortgageComponent.getMortgages().get(0);

        return new Customer(mortgage, bankaccount);
    }

    @Override
    public void save(final Customer customer) {
        bankAccountComponent.save(customer.getBankAccount());
        mortgageComponent.save(customer.getMortgage());
    }
}
