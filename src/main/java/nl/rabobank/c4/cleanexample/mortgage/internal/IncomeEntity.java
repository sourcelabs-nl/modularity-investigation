package nl.rabobank.c4.cleanexample.mortgage.internal;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
class IncomeEntity {

    private int income;
}
