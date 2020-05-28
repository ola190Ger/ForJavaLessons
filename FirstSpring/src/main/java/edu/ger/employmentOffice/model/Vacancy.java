package edu.ger.employmentOffice.model;
/*
 * Vacancy data class
 * TODO: change class after update
 * */
import java.util.Objects;

public class Vacancy {
    private String id;
    private String name;
    private String vacancyName;
    private String description;
    private String requirement;
    private String responsibility;
    private String conditions;
    private Integer salary;
    private Boolean statusVacancy;

    private Category category;
    private User user;



    public Vacancy() {
    }

    public Vacancy(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return id.equals(vacancy.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
