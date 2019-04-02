package nl.rabobank.modular.monolith.example.mortgage.internal;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class IetsEntity {

    @Id
    private UUID id;
}
