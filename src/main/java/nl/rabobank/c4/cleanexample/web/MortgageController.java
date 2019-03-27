package nl.rabobank.c4.cleanexample.web;

import java.util.List;

import nl.rabobank.c4.cleanexample.mortgage.MortgageComponent;
import nl.rabobank.c4.cleanexample.mortgage.domain.Mortgage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mortgage/v1/")
public class MortgageController {

    private final MortgageComponent mortgageComponent;

    @GetMapping()
    public List<Mortgage> getMorgage() {
       return mortgageComponent.getMortgages();
    }
}
