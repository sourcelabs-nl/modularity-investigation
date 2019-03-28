package nl.rabobank.c4.cleanexample.customer.domain;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Customer {

    private Mortgage mortgage;

    private BankAccount bankAccount;
}
