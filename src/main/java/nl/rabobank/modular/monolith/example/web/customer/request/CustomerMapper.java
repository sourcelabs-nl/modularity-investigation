package nl.rabobank.modular.monolith.example.web.customer.request;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.mortgage.domain.BonusRegelingen;
import nl.rabobank.modular.monolith.example.mortgage.domain.CollatoralObject;
import nl.rabobank.modular.monolith.example.mortgage.domain.Income;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.domain.VakantieGeld;
import nl.rabobank.modular.monolith.example.web.customer.request.model.CustomerRequest;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    public Customer map(final CustomerRequest customerRequest) {
        Income income = new Income(customerRequest.getIncome(), new VakantieGeld(0), new BonusRegelingen(0));
        CollatoralObject collatoralObject = new CollatoralObject(customerRequest.getMortgageAddress());
        Mortgage mortgage = new Mortgage("", income, collatoralObject);
        BankAccount bankAccount = new BankAccount(customerRequest.getBankAccountNumber(), customerRequest.getLastName(), customerRequest.getInittials());
        return new Customer(mortgage, bankAccount);
    }
}
