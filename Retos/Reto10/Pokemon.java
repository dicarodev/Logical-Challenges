package com.dicarodev;

public class Pokemon {
    private int id;
    private String name;
    private int order;
    private int weight;

    public Pokemon() {
    }

    public Pokemon(int id, String name, int order, int weight) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", weight=" + weight +
                '}';
    }
}
