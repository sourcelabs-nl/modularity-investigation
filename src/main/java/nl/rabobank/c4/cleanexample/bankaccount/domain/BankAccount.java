package nl.rabobank.c4.cleanexample.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class BankAccount {

    private String bankAccountNumber;
    private String lastName;
    private String initals;

}
