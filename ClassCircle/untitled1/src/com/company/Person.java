package com.company;

import java.time.LocalDate;
import java.util.Date;

// parent class
public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, String patronymic, String gender, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthDay = birthDay;
    }
    //TODO:
    public Boolean isAdult(){

        return (LocalDate.now().getYear()-getBirthDay().getYear())>18? true:false;
    }
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
