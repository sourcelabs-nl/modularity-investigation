package nl.rabobank.modular.monolith.example.web.customer.request.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

    private String bankAccountNumber;
    private String lastName;
    private String inittials;
    private int income;
    private String mortgageAddress;

}
