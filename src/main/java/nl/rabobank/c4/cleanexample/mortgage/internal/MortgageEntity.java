package nl.rabobank.c4.cleanexample.mortgage.internal;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
class MortgageEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Embedded
    private IncomeEntity incomeEntity;

    @Embedded
    private CollatoralObjectEntity collatoralObjectEntity;
}
