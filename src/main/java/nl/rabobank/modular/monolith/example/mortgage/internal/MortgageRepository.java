package nl.rabobank.modular.monolith.example.mortgage.internal;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.Repository;

public interface MortgageRepository extends Repository<MortgageEntity, UUID> {

    List<MortgageEntity> findAll();

    void save(MortgageEntity mortgageEntity);
}
