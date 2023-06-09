package com.fsse2305.Lab_b02.data;

import com.fsse2305.Lab_b02.data.entity.PersonEntity;

public class GetAllPerosn {
    private String lastName;
    private String firstName;
    private String hkid;

    public GetAllPerosn(PersonEntity entity){
        this.lastName = entity.getLastName();
        this.firstName = entity.getFirstName();
        this.hkid = entity.getHkid();
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


