package com.blueNumbers.blueNumbers.mapper;

import com.blueNumbers.blueNumbers.domain.Results;
import com.blueNumbers.blueNumbers.domain.ResultsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultsMapper {

    public Results mapToResult(final ResultsDto resultsDto) {
        return new Results(
                resultsDto.getId(),
                resultsDto.getTime(),
                resultsDto.getPatrolType(),
                resultsDto.getNick(),
                resultsDto.getPeople(),
                resultsDto.getInterventions(),
                resultsDto.getInstruction(),
                resultsDto.getInstructionFor(),
                resultsDto.getTickets(),
                resultsDto.getTicketsFor(),
                resultsDto.getNotes(),
                resultsDto.getVehicles(),
                resultsDto.getMrd5(),
                resultsDto.getLeads());
    }

    public ResultsDto mapToResultDto(final Results results) {
        return new ResultsDto(
                results.getId(),
                results.getTime(),
                results.getPatrolType(),
                results.getNick(),
                results.getPeople(),
                results.getInterventions(),
                results.getInstruction(),
                results.getInstructionFor(),
                results.getTickets(),
                results.getTicketsFor(),
                results.getNotes(),
                results.getVehicles(),
                results.getMrd5(),
                results.getLeads());
    }

    public List<ResultsDto> mepToDtoList(final List<Results> resultsList) {
        return resultsList.stream()
                .map(e -> new ResultsDto(e.getId(), e.getTime(), e.getPatrolType(), e.getNick(),
                        e.getPeople(), e.getInterventions(), e.getInstruction(), e.getInstructionFor(),
                        e.getTickets(), e.getTicketsFor(), e.getNotes(), e.getVehicles(), e.getMrd5(),
                        e.getLeads()))
                .collect(Collectors.toList());

    }

}
