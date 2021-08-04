package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {
    Backlog findByProjectIdentifier(String Identifier);
}
