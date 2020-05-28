package edu.ger.employmentOffice.model;
/*
* Candidate data class
* */

import java.io.File;
import java.util.List;

public class Resume {
    private String id;
    private String vacancyName;
    private Integer experience;
    private List<String> skills;
    private String summary;
    private List<String> applaies;
    private File attachment;
    private Integer salary;
    private String schedule;
    private Boolean relocate;

    private Category category;
    private User user;
}

/*
 * don`t write constr, set/get and etc there is a full class
 * vacancyName is possible to put it in a separate table
 *
 * */