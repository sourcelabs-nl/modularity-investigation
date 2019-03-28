package nl.rabobank.c4.cleanexample.web;

import nl.rabobank.c4.cleanexample.customer.CustomerComponent;
import nl.rabobank.c4.cleanexample.customer.domain.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer/v0/")
public class CustomerController {

    private final CustomerComponent customerComponent;

    @GetMapping()
    public Customer getCustomer() {
        return customerComponent.getCustomer();
    }
}
