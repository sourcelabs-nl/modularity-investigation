package nl.rabobank.modular.monolith.example.bankaccount.internal;

import static org.assertj.core.api.Assertions.assertThat;

import nl.rabobank.modular.monolith.example.CleanExampleApplication;
import nl.rabobank.modular.monolith.example.bankaccount.BankAccountComponent;
import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CleanExampleApplication.class)
public class BankAccountComponentIT {

    @Autowired
    private BankAccountComponent bankAccountComponent;

    @Autowired
    private BankaccountRepository bankaccountRepository;

    @Before
    public void before() {
        BankAccountEntity bankAccount = new BankAccountEntity();
        bankAccount.setBankAccountNumber("123");
        bankAccount.setLastName("jansen");
        bankAccount.setInitals("tst");
        bankaccountRepository.save(bankAccount);
    }

    @Test
    public void shouldGetBankAccount() {
        BankAccount result = bankAccountComponent.getBankAccount("123");

        assertThat(result).isNotNull();
    }

}
