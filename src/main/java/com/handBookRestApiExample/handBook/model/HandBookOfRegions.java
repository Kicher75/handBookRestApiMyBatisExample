package com.handBookRestApiExample.handBook.model;


public class HandBookOfRegions {

    private int id;
    private String full_name_of_region;
    private String abbreviation_of_region;

    public HandBookOfRegions(int id,
                             String full_name_of_region,
                             String abbreviation_of_region) {
        this.id = id;
        this.full_name_of_region = full_name_of_region;
        this.abbreviation_of_region = abbreviation_of_region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name_of_region() {
        return full_name_of_region;
    }

    public void setFull_name_of_region(String full_name_of_region) {
        this.full_name_of_region = full_name_of_region;
    }

    public String getAbbreviation_of_region() {
        return abbreviation_of_region;
    }

    public void setAbbreviation_of_region(String abbreviation_of_region) {
        this.abbreviation_of_region = abbreviation_of_region;
    }
}
