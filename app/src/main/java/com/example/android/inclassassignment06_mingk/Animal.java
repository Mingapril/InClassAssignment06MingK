package com.example.android.inclassassignment06_mingk;

import java.io.Serializable;

public class Animal implements Serializable {

    private String name;
    private int legs;
    private boolean hasFur;
    private String moreInfo;


    public Animal(String aName, int aLegs, boolean aHasFur, String aInfo){
        this.name = aName;
        this.legs = aLegs;
        this.hasFur = aHasFur;
        this.moreInfo = aInfo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs =legs;
    }

    public boolean getHasFur(){
        return hasFur;
    }

    public void setHasFur(boolean hasFur){
        this.hasFur = hasFur;
    }

    public String getMoreInfo(){
        return moreInfo;
    }

    public void setMoreInfo(String information){
        this.moreInfo = information;
    }


}
