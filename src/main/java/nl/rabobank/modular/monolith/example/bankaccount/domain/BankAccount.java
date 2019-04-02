package nl.rabobank.modular.monolith.example.bankaccount.domain;

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
