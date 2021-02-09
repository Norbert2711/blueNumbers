package com.blueNumbers.blueNumbers.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResultsDto {

    private Long id;
    private String data;
    private String patrolType;
    private String name;
    private String people;
    private String interventions;
    private String instruction;
    private String instructionFor;
    private String tickets;
    private String ticketsFor;
    private String notes;
    private String vehicles;
    private String mrd5;
    private String leads;

}
