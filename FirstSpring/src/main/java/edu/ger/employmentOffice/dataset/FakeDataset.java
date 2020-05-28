package edu.ger.employmentOffice.dataset;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Spend;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeDataset {


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
