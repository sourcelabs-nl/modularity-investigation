package nl.rabobank.modular.monolith.example.web.customer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import nl.rabobank.modular.monolith.example.bankaccount.domain.BankAccount;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;
import nl.rabobank.modular.monolith.example.mortgage.domain.BonusRegelingen;
import nl.rabobank.modular.monolith.example.mortgage.domain.CollatoralObject;
import nl.rabobank.modular.monolith.example.mortgage.domain.Income;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;
import nl.rabobank.modular.monolith.example.mortgage.domain.VakantieGeld;
import nl.rabobank.modular.monolith.example.web.customer.operations.GetCustomerOperation;
import nl.rabobank.modular.monolith.example.web.customer.operations.PostCustomerOperation;
import nl.rabobank.modular.monolith.example.web.customer.response.CustomerResponseMapper;
import nl.rabobank.modular.monolith.example.web.customer.response.model.CustomerResponse;

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

    private JacksonTester<CustomerResponse> bankAccountJacksonTester;

    @MockBean
    private GetCustomerOperation getCustomerOperation;

    @MockBean
    private PostCustomerOperation postCustomerOperation;

    @Autowired
    private MockMvc mvc;

    @Before
    public void before() {
        JacksonTester.initFields(this, new ObjectMapper());
    }

    @Test
    public void canRetrieveByIdWhenExists() throws Exception {
        given(getCustomerOperation.getCustomer()).willReturn(getCustomerRespons());

        // when
        MockHttpServletResponse response = mvc.perform(get("/api/customer/v0/").accept(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(bankAccountJacksonTester.write(getCustomerRespons())
                .getJson());
    }

    private CustomerResponse getCustomerRespons() {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setBankAccountNumber("12345");
        customerResponse.setInitials("pfj");
        customerResponse.setLastName("test");
        customerResponse.setIncome(50000);
        customerResponse.setMortgageAddress("Langestraat 3");
        return customerResponse;
    }
}
