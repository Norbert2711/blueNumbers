package com.blueNumbers.blueNumbers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "results")
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "incrementDomain")
    @GenericGenerator(name = "incrementDomain", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @Column(name = "data")
    private String day;

    @Column(name = "type_of_patrol")
    private String patrolType;

    @Column(name = "nazwisko")
    private String name;

    @Column(name = "legitymowanych")
    private String people;

    @Column(name = "interwencji")
    private String interventions;

    @Column(name = "pouczenia_ile")
    private String instruction;

    @Column(name = "poczenia_za_co")
    private String instructionFor;

    @Column(name = "mandaty_ile")
    private String tickets;

    @Column(name = "mandaty_za_co")
    private String ticketsFor;

    @Column(name = "notatki")
    private String notes;

    @Column(name = "pojazdow")
    private String vehicles;

    @Column(name = "MRD5")
    private String mrd5;

    @Column(name = "doprowadzenia")
    private String leads;

}
