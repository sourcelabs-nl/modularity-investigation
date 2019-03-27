package nl.rabobank.c4.cleanexample.mortgage;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.Repository;

public interface MortgageRepository extends Repository<MortgageEntity, UUID> {

    List<MortgageEntity> findAll();

    void save(MortgageEntity mortgageEntity);
}
