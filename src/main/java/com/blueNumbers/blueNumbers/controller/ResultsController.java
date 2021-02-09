package com.blueNumbers.blueNumbers.controller;

import com.blueNumbers.blueNumbers.domain.Results;
import com.blueNumbers.blueNumbers.domain.ResultsDto;
import com.blueNumbers.blueNumbers.mapper.ResultsMapper;
import com.blueNumbers.blueNumbers.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/results/")
public class ResultsController {

    @Autowired
    private ResultsService service;

    @Autowired
    private ResultsMapper mapper;

    @RequestMapping(method = RequestMethod.GET, name = "getResults")
    public List<ResultsDto> getResults() {
        return mapper.mepToDtoList(service.getAllResults());
    }

    @RequestMapping(method = RequestMethod.GET, name = "getResult")
    public ResultsDto getResult(Long id) throws NotFoundException {
        return mapper.mapToResultDto(service.getResult(id).orElseThrow(NotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, name = "deleteResult")
    public void deleteResult(@RequestParam Long id) {
        service.deleteResult(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateResult")
    public ResultsDto updateResult(@RequestBody ResultsDto resultsDto) {
        return mapper.mapToResultDto(service.saveResult(mapper.mapToResult(resultsDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createResult", consumes = APPLICATION_JSON_VALUE)
    public void createResult(@RequestBody ResultsDto resultsDto) {
        service.saveResult(mapper.mapToResult(resultsDto));
    }

}
