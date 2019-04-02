package nl.rabobank.modular.monolith.example.mortgage.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Mortgage {

    private String id;
    private Income income;
    private CollatoralObject collatoralObject;
}
