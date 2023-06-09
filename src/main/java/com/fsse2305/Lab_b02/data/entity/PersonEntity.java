package com.fsse2305.Lab_b02.data.entity;

import com.fsse2305.Lab_b02.data.CreatePersonData;

public class PersonEntity {
    private String lastName;
    private String firstName;
    private String hkid;

    public PersonEntity(){}

    public PersonEntity(CreatePersonData data) {
        this.lastName = data.getLastName();
        this.firstName = data.getFirstName();
        this.hkid = data.getHkid();




    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }
}
