package nl.rabobank.c4.cleanexample.bankaccount.internal;

import static org.assertj.core.api.Assertions.assertThat;

import nl.rabobank.c4.cleanexample.CleanExampleApplication;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

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
        BankAccount result = bankAccountComponent.getBankaccount("123");

        assertThat(result).isNotNull();
    }

}
