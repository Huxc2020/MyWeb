package com.example.myproject1;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    String userId;
    String name;
    @Column(name = "tel_number", length = 254)
    String telNumber;
    String location;
    Boolean isInjected;
    Boolean isMijie;


    public User() {
    }

    public User(String userId, String name, String telNumber, String location, Boolean isInjected, Boolean isMijie) {
        this.userId = userId;
        this.name = name;
        this.telNumber = telNumber;
        this.location = location;
        this.isInjected = isInjected;
        this.isMijie = isMijie;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }


    public Boolean getIsInjected() {
        return isInjected;
    }

    public void setIsInjected(Boolean injected) {
        isInjected = injected;
    }

    public Boolean getIsMijie() {
        return isMijie;
    }

    public void setIsMijie(Boolean mijie) {
        isMijie = mijie;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
