package nl.rabobank.modular.monolith.example.web;

import java.util.List;

import nl.rabobank.modular.monolith.example.mortgage.MortgageComponent;
import nl.rabobank.modular.monolith.example.mortgage.domain.Mortgage;

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
