package nl.rabobank.modular.monolith.example.bankaccount.internal;


import static org.assertj.core.api.Assertions.assertThat;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BankaccountRepositoryTest {

    @Autowired
    private BankaccountRepository bankaccountRepository;

    @Test
    public void shouldSaveAndFind() {
        BankAccountEntity bankAccount = new BankAccountEntity();
        bankAccount.setBankAccountNumber("123");
        bankAccount.setLastName("jansen");
        bankAccount.setInitals("j");
        bankaccountRepository.save(bankAccount);

        BankAccount result = bankaccountRepository.findByBankAccountNumber("123");

        assertThat(result).isNotNull();
        assertThat(result.getLastName()).isEqualTo(bankAccount.getLastName());
    }

}
