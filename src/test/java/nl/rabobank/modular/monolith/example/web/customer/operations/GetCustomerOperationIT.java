package nl.rabobank.modular.monolith.example.web.customer.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.customer.CustomerComponent;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.mortgage.domain.BonusRegelingen;
import nl.rabobank.modular.monolith.example.mortgage.domain.CollatoralObject;
import nl.rabobank.modular.monolith.example.mortgage.domain.Income;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.domain.VakantieGeld;
import nl.rabobank.modular.monolith.example.web.customer.response.model.CustomerResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GetCustomerOperationIT {

    @MockBean
    private CustomerComponent customerComponent;

    @Autowired
    private GetCustomerOperation getCustomerOperation;

    @Test
    public void shouldGetCustomer() {
        when(customerComponent.getCustomer()).thenReturn(getCustomer());

        CustomerResponse customer = getCustomerOperation.getCustomer();

        assertThat(customer).isNotNull();
    }

    private Customer getCustomer() {
        return new Customer(new Mortgage("", new Income(30000, new VakantieGeld(1200), new BonusRegelingen(1800)), new CollatoralObject("palmsuikerweg")),
                new BankAccount("1234567", "test", "id"));
    }

}
