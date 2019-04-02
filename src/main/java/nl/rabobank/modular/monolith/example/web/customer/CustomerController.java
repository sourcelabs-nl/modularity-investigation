package nl.rabobank.modular.monolith.example.web.customer;

import nl.rabobank.modular.monolith.example.web.customer.operations.GetCustomerOperation;
import nl.rabobank.modular.monolith.example.web.customer.operations.PostCustomerOperation;
import nl.rabobank.modular.monolith.example.web.customer.request.model.CustomerRequest;
import nl.rabobank.modular.monolith.example.web.customer.response.model.CustomerResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer/v0/")
public class CustomerController {

    private final GetCustomerOperation getCustomerOperation;

    private final PostCustomerOperation postCustomerOperation;

    @GetMapping()
    public CustomerResponse getCustomer() {
        return getCustomerOperation.getCustomer();
    }

    @PostMapping
    public void postCustomer(final CustomerRequest customerRequest) {
        postCustomerOperation.postCustomer(customerRequest);
    }
}
