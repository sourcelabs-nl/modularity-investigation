package nl.rabobank.modular.monolith.example.web.customer.operations;

import nl.rabobank.modular.monolith.example.customer.CustomerComponent;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.web.customer.request.CustomerMapper;
import nl.rabobank.modular.monolith.example.web.customer.request.model.CustomerRequest;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PostCustomerOperation {

    private final CustomerComponent customerComponent;

    private final CustomerMapper customerMapper;

    public void postCustomer(CustomerRequest customerRequest) {
        Customer customer = customerMapper.map(customerRequest);
        customerComponent.save(customer);
    }

}
