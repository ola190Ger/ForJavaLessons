package edu.ger.firstspring.Model;
/*
* user who can use program
* */
import java.io.File;
import java.util.Date;
import java.util.List;

public class User {
    private String id;
    private String name;
    private Date birthDay;
    private String email;
    private String phone;
    private String login;
    private String password;
    private String location;

    private List<Role> roles;
    private Tariff tariff;

    private List<File> attachment;
    private String description;

    /*
    * don`t write constr, set/get and etc there is a full class
    * */

}
