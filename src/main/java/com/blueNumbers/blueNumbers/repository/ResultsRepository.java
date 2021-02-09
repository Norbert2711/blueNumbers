package com.blueNumbers.blueNumbers.repository;

import com.blueNumbers.blueNumbers.domain.Results;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ResultsRepository extends CrudRepository<Results, Long> {

    @Override
    List<Results> findAll();

    @Override
    Optional<Results> findById(Long id);

    @Override
    Results save(Results results);

}
