package ru.company.homework;

public class Clothes {
    private String nameOfClothes;
    private Integer size;
    private Integer numberOfPocket;
    private String  colour;

    public Clothes(String nameOfClothes, Integer size, Integer numberOfPocket, String colour) {
        this.nameOfClothes = nameOfClothes;
        this.size = size;
        this.numberOfPocket = numberOfPocket;
        this.colour = colour;
    }

    public String getNameOfClothes() {
        return nameOfClothes;
    }

    public void setNameOfClothes(String nameOfClothes) {
        this.nameOfClothes = nameOfClothes;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumberOfPocket() {
        return numberOfPocket;
    }

    public void setNumberOfPocket(Integer numberOfPocket) {
        this.numberOfPocket = numberOfPocket;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
