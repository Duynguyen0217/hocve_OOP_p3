package com.example.hocve_oop_p3;

public class animal {
    private String name;
    private Integer weight;

    public animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    // Display : in ra thông tin
    // Nếu truyền String name  : in ra tên
    // Nếu truyền String name , Integer weight : in ra cả hai
    // Nếu không truyền : như bên dưới

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';

    }

}
