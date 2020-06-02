package edu.ger.employmentOffice.dataset;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.model.Vacancy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
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

    //role for user
    private List<Role> roles = new ArrayList<>(
            Arrays.asList(
                    new Role("1", "Admin"),
                    new Role("2", "Candidate"),
                    new Role("3", "Employer")
            )
    );
    public List<Role> getRoles(){
        return roles;
    }


    //type spend
    private List<Spend> spends= new ArrayList<>(
            Arrays.asList(
                    new Spend("1", "Cafe", "desc1"),
                    new Spend("2", "communal", "desc2"),
                    new Spend("3", "salaries", "desc3"))
    );
     public List<Spend> getSpends(){
         //List<Spend> spends1=spends;
         return spends;
     }


}
