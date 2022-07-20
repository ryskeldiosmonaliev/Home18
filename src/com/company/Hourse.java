package com.company;

public class Hourse extends Farm{
    private String color;
    public Hourse(double weight, int age, String gender, String nickNameme,String color) {
        super(weight, age, gender, nickNameme);
        this.color = color;
    }
    @Override
    public String toString() {
        return getWeight()+"\n"+getAge()+"\n"+getGender()+"\n"+getNickNameme();
    }
}
