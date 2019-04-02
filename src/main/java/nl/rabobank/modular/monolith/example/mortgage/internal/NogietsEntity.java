package nl.rabobank.modular.monolith.example.mortgage.internal;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class NogietsEntity {

    @Id
    private UUID id;

}
