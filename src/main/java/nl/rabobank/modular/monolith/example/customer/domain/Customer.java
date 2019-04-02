package nl.rabobank.modular.monolith.example.customer.domain;
import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Customer {

    private Mortgage mortgage;

    private BankAccount bankAccount;
}
