package nl.rabobank.c4.cleanexample.bankaccount.internal;

import static org.assertj.core.api.Assertions.assertThat;

import nl.rabobank.c4.cleanexample.CleanExampleApplication;
import nl.rabobank.c4.cleanexample.bankaccount.BankAccountComponent;
import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@SpringBootTest(classes = { CleanExampleApplication.class, BankaccountRepository.class, BankAccountEntityMapper.class, BankAccountComponentDefault.class })
public class BankAccountComponentIT {

    @Autowired
    private BankAccountComponent bankAccountComponent;

    @Test
    public void shouldGetBankAccount() {
        BankAccount result = bankAccountComponent.getBankaccount("1234567");

        assertThat(result).isNotNull();
    }

}
