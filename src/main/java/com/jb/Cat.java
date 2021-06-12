package com.jb;

public class Cat {

    private int id;
    private String Name;
    private String color;
    private float weight;

    public Cat() {

    }

    public Cat(String name, String color, float weight, float weight1) {
        Name = name;
        this.color = color;
        this.weight = weight;
        this.weight = weight1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cat(int id, String name, String color, float weight) {
        this.id = id;
        Name = name;
        this.color = color;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", weight=" + weight +
                '}';
    }

}
