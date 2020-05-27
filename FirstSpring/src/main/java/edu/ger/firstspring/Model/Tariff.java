package edu.ger.firstspring.Model;

import java.util.Date;

/*
* payment tool
* based -general facilities (create vac/res, read vac/res, аплаиться на вакансию)
* plan - payment once 3 month(1 year) (+ see contacts)
* profi - using office manager, who gives 5 candidate. Payment 70% after job offer
* help - 1 service example searching, interviewing, technical/psychology test, certification, create resume and other
* */
public class Tariff {
    private String id;
    private String name; // perhaps will enum Tool
    private Double price;
    private Date expirationDate;
}
