package nl.rabobank.modular.monolith.example.bankaccount.internal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "bankaccount")
class BankAccountEntity {

    @Id
    private String bankAccountNumber;

    private String lastName;
    private String initals;
}
