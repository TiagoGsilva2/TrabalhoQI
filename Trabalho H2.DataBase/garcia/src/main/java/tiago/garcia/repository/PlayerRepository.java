package tiago.garcia.repository;


import tiago.garcia.model.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

// A partir desta começa a parte persistência - JPA
public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
}