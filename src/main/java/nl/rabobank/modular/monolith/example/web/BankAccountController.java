package nl.rabobank.modular.monolith.example.web;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.bankaccount.BankAccountComponent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bankaccount/v1/")
public class BankAccountController {

    private final BankAccountComponent bankAccountComponent;

    @GetMapping(value = "{number}")
    public BankAccount getBankAccount(@PathVariable("number") final String number) {
        return bankAccountComponent.getBankAccount(number);
    }
}
