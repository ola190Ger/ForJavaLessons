package com.company;



import java.awt.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student {
    private Person person;
    private Image foto;
    private String phone;
    private String email;
    private int IDNumber;
    private String PassportSeria;
    private int PassportNumber;
    private String whoGetPassport;
    private Date whenGetPassport;
    private String isCriminalRecord;
    private String registrationAdress;
    private Boolean isNeedBursa;
    private String group;
    private String department;
    private String chair;
    private int startYear;
    private List<String> subjects;
    private List<Image> scanDocuments;
    private Integer[] assessment;
    private Boolean isBachelor;
    private Boolean isFreeEducation;
    private String socialActivity;
    private String sportActivity;
    private String sportMedicalGroup;
    private Person extraPerson1;
    private String extraPhone1;
    private Person extraPerson2;
    private String extraPhone2;
    private String summary;
    private int getCurrentRate(){
       return LocalDate.now().getYear()-startYear;
    }
    private double getGrant(double MinimumRate){

        if(isFreeEducation)
            switch ((int) getAvgAssessment()) {
                case (5):
                    return MinimumRate + MinimumRate / 2;

                case (4):
                    return MinimumRate;

                case(3):
                case(2):
                case(1): return 0;
            }
        return 0;

    }



    public Student() {
    }

    private double getAvgAssessment(){
        double res=0;
        for (Integer integer : assessment) {
            res += integer;
        }
        return res/assessment.length;
    }





}
