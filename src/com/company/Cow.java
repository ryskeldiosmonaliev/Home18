package com.company;

public class Cow extends Farm{
    @Override
    public String toString() {
        return getWeight()+"\n"+getAge()+"\n"+getGender()+"\n"+getNickNameme();
    }

    public Cow(double weight, int age, String gender, String nickNameme) {
        super(weight, age, gender, nickNameme);
    }
}
