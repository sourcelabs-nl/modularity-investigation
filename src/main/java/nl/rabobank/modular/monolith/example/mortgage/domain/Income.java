package nl.rabobank.modular.monolith.example.mortgage.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Income {

    private int amount;
    private VakantieGeld vakantieGeld;
    private BonusRegelingen bonusRegelingen;
}
