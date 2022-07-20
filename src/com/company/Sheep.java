package com.company;

public class Sheep extends Farm{
    public Sheep(double weight, int age, String gender, String nickNameme) {
        super(weight, age, gender, nickNameme);

    }
    @Override
    public String toString() {
        return getWeight()+"\n"+getAge()+"\n"+getGender()+"\n"+getNickNameme();
    }
}
