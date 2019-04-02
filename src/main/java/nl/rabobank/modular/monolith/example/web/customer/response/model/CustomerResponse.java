package nl.rabobank.modular.monolith.example.web.customer.response.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerResponse {

    private String bankAccountNumber;

    private int income;

    private String initials;

    private String lastName;

    private String mortgageAddress;

}
