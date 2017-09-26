package io.ian.betterforms.repositories;


import io.ian.betterforms.models.Secret;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretRepository extends CrudRepository<Secret, Long>{
}
