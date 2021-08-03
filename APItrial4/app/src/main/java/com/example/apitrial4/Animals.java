package com.example.apitrial4;

public class Animals {


    public String bred_for;
    public String bred_group;
    public String id;
    public String life_span;
    public String name;
    public String origin;
    public String temperament;
    height height = new height();
    Weight weight = new Weight();
    image image = new image();

    public String getBred_for() {
        return bred_for;
    }

    public void setBred_for(String bred_for) {
        this.bred_for = bred_for;
    }

    public String getBred_group() {
        return bred_group;
    }

    public void setBred_group(String bred_group) {
        this.bred_group = bred_group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public com.example.apitrial4.height getHeight() {
        return height;
    }

    public void setHeight(com.example.apitrial4.height height) {
        this.height = height;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public com.example.apitrial4.image getImage() {
        return image;
    }

    public void setImage(com.example.apitrial4.image image) {
        this.image = image;
    }
}
