package edu.ger.employmentOffice.model;
/*
 * type of users: admin, candidate, manager, employer
 * */
import java.util.Objects;


public class Role {
    private String id;
    private String name;
    private String desc;

    public Role() {
    }

    public Role(String id, String name) {
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
        return "Roles{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role roles = (Role) o;
        return id.equals(roles.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
