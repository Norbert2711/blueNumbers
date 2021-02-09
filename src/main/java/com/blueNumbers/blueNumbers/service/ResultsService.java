package com.blueNumbers.blueNumbers.service;

import com.blueNumbers.blueNumbers.domain.Results;
import com.blueNumbers.blueNumbers.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultsService {

    @Autowired
    private ResultsRepository repository;

    public List<Results> getAllResults() {
        return repository.findAll();
    }

    public Optional<Results> getResult(Long id) {
        return repository.findById(id);
    }

    public Results saveResult(Results results) {
        return repository.save(results);
    }

    public void deleteResult(Long id) {
        repository.deleteById(id);
    }

}
