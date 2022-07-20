package com.company;

import java.util.Arrays;

public class Farm {
    private double weight;
    private int age;
    private String gender;
    private String nickNameme;
    private String ownerName;
    private String addres;

    private Cow [] cows;
    private Hourse [] hourses;
    private Sheep [] sheeps;


    public Farm(double weight, int age, String gender, String nickNameme) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickNameme = nickNameme;
    }   public Farm(String ownerName, String addres,Cow [] cows, Hourse [] hourses, Sheep [] sheeps) {
        this.ownerName = ownerName;
        this.addres = addres;
        this.cows = cows;
        this.hourses = hourses;
        this.sheeps = sheeps;}


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickNameme() {
        return nickNameme;
    }

    public void setNickNameme(String nickNameme) {
        this.nickNameme = nickNameme;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "OwnerName='" + ownerName + '\'' +
                ", addres='" + addres + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", hourses=" + Arrays.toString(hourses) +
                ", sheeps=" + Arrays.toString(sheeps) +
                '}';
    }
}
