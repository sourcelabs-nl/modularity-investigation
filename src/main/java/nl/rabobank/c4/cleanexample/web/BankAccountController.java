package nl.rabobank.c4.cleanexample.web;

import nl.rabobank.c4.cleanexample.bankaccount.BankAccount;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;

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
        return bankAccountComponent.getBankaccount(number);
    }
}
