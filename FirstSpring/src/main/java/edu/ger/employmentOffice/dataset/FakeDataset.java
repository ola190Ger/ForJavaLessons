package edu.ger.employmentOffice.dataset;

import edu.ger.employmentOffice.model.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class FakeDataset {


    //database jobs category
    private List<Category> categories = new ArrayList<>(
            Arrays.asList(
                    new Category("1", "Finance", "description category Finance"),
                    new Category("2", "IT", "description category IT"),
                    new Category("3", "Gastronomy", "description category Gastronomy")
            )
    );

    public List<Category> getCategories(){
        return categories;
    }

    //role for user
    private List<Role> roles = new ArrayList<>(
            Arrays.asList(
                    new Role("1", "Admin","Describe roles Admin"),
                    new Role("2", "Candidate","Describe roles Candidate"),
                    new Role("3", "Employer", "Describe roles Employer"),
                    new Role("4", "Accountant", "Describe roles Accountant")
            )
    );
    public List<Role> getRoles(){
        return roles;
    }

    //Spends list
    private List<Spend> spends = new ArrayList<>(
            Arrays.asList(
                    new Spend("1", "Stationery","Describe: pen, pencil etc."),
                    new Spend("2", "Communal payment","Describe: gas, water etc."),
                    new Spend("3", "Salary","Describe: Ivanov I, Petriuk P etc.")
            )
    );

    public List<Spend> getSpends(){return spends;}

    //Tariffs list
    private List<Tariff> tariffs = new ArrayList<>(
            Arrays.asList(
                    new Tariff("1", "Base",  0.0,
                            LocalDate.of(2020,12,1),
                            "base tariff"),
                    new Tariff("2", "Plan",  20.5, LocalDate.of(2020,12,1), "You can see all contact"),
                    new Tariff("3", "Profi",  0.0, LocalDate.of(2020,12,1), "using office manager, who gives 5 candidate. Payment 70% after job offer"),
                    new Tariff("4", "Help",  10.2, LocalDate.of(2020,12,1), "1 service example searching, interviewing, technical/psychology test, certification, create resume and other")
            )
    );

    public List<Tariff> getTariffs(){return tariffs;}

    //List vacancy
    private List<Vacancy>vacancies = new ArrayList<>(
            Arrays.asList(
                    new Vacancy("1","Developer",categories.get(0)),
                    new Vacancy("2","Chef",categories.get(2)),
                    new Vacancy("3","Designer",categories.get(0)),
                    new Vacancy("4","Accountant",categories.get(1)),
                    new Vacancy("5","Officiant",categories.get(2))
            )
    );
    public List<Vacancy> getVacancies(){
        return vacancies;
    }







}
