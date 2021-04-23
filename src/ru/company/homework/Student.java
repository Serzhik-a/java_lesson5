package ru.company.homework;

import ru.company.homework.Enums.Gender;

public class Student {
    private String name;
    private Clothes clothes;
    private Gender gender;
    private Integer age;

    public Student(String name, Integer age, Clothes clothes, Gender gender) {
        this.name = name;
        this.age = age;
        this.clothes = clothes;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
