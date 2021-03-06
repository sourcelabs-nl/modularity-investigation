package nl.rabobank.c4.cleanexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class CleanExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanExampleApplication.class, args);
    }

}
