/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Dukcapil {

    protected String nik;
    protected String fullName;
    protected String birthDate;
    protected String birthPlace;
    protected String maidenName;
    protected String gender;
    protected String channel;
    protected String uid;
    
    public Dukcapil(){
        
    }
    
    public Dukcapil(String nik, String fullName, String birthDate, String birthPlace, String maidenName, String gender,
                    String channel, String uid){
        this.nik = nik;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.maidenName = maidenName;
        this.gender = gender;
        this.channel = channel;
        this.uid = uid;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

        
}
