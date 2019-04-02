package nl.rabobank.modular.monolith.example.mortgage.internal;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
class CollatoralObjectEntity {

    private String name;
}
