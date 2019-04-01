package nl.rabobank.c4.cleanexample.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import nl.rabobank.c4.cleanexample.bankaccount.domain.BankAccount;
import nl.rabobank.c4.cleanexample.customer.CustomerComponent;
import nl.rabobank.c4.cleanexample.customer.domain.Customer;
import nl.rabobank.c4.cleanexample.mortgage.domain.BonusRegelingen;
import nl.rabobank.c4.cleanexample.mortgage.domain.CollatoralObject;
import nl.rabobank.c4.cleanexample.mortgage.domain.Income;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;
import nl.rabobank.c4.cleanexample.mortgage.domain.VakantieGeld;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    private JacksonTester<Customer> bankAccountJacksonTester;

    @MockBean
    private CustomerComponent customerComponent;

    @Autowired
    private MockMvc mvc;

    @Before
    public void before() {
        JacksonTester.initFields(this, new ObjectMapper());
    }

    @Test
    public void canRetrieveByIdWhenExists() throws Exception {
        given(customerComponent.getCustomer()).willReturn(getCustomer());

        // when
        MockHttpServletResponse response = mvc.perform(get("/api/customer/v0/").accept(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(bankAccountJacksonTester.write(getCustomer())
                .getJson());
    }

    private Customer getCustomer() {
        return new Customer(new Mortgage("", new Income(30000, new VakantieGeld(1200), new BonusRegelingen(1800)), new CollatoralObject("palmsuikerweg")),
                new BankAccount("1234567", "test", "id"));
    }
}
