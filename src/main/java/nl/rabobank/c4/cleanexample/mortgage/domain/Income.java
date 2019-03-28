package nl.rabobank.c4.cleanexample.mortgage.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Income {

    private int amount;
    private Iets iets;
    private Nogiets nogiets;
}
