package com.example.profilecard;

public class Profile {

    String firstName, lastName, streetAddress1, streetAddress2, dob;

    //constructor
    public Profile(String firstName, String lastName, String streetAddress1, String streetAddress2,
    String dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.dob = dob;
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

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}


