package edu.ger.employmentOffice.model;
/*
* offer data class
* */
import java.time.LocalDate;
import java.util.Date;

public class Offer {
    private String id;
    private LocalDate dateConclusion;
    private Double salary;
    private LocalDate startDate;
    private String schedule;
    private Integer vacationDays;
    private Integer healsDays;
    private String approbationPeriod;
    private String approbationSalary;

    private User candidate;
    //private User employer;
    private Vacancy vacancy;



}
