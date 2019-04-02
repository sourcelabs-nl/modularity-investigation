package nl.rabobank.modular.monolith.example.web.customer.response;

import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.web.customer.response.model.CustomerResponse;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomerResponseMapper {

    public CustomerResponse map(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setBankAccountNumber(customer.getBankAccount().getBankAccountNumber());
        customerResponse.setLastName(customer.getBankAccount().getLastName());
        customerResponse.setInitials(customer.getBankAccount().getInitals());
        customerResponse.setMortgageAddress(customer.getMortgage().getCollatoralObject().getAddress());
        customerResponse.setIncome(customer.getMortgage().getIncome().getAmount());
        return customerResponse;
    }

}
