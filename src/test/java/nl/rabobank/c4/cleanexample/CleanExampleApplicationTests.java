package nl.rabobank.c4.cleanexample;

import static org.assertj.core.api.Assertions.assertThat;

import nl.rabobank.c4.cleanexample.web.MortgageController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CleanExampleApplicationTests {

    @Autowired
    private MortgageController mortgageController;


    @Test
    public void contextLoads() {
        assertThat(mortgageController).isNotNull();
    }

}
