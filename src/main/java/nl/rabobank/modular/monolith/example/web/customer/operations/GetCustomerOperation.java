package nl.rabobank.modular.monolith.example.web.customer.operations;

import nl.rabobank.modular.monolith.example.customer.CustomerComponent;
import nl.rabobank.modular.monolith.example.web.customer.response.CustomerResponseMapper;
import nl.rabobank.modular.monolith.example.web.customer.response.model.CustomerResponse;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GetCustomerOperation {

    private final CustomerComponent customerComponent;

    private final CustomerResponseMapper customerResponseMapper;

    public CustomerResponse getCustomer() {
        return customerResponseMapper.map(customerComponent.getCustomer());
    }

}
