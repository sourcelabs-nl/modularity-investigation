package nl.rabobank.c4.cleanexample.mortgage;

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
class CollatoralObjectEntity {

    @Id
    private UUID id;

    private String name;
}
