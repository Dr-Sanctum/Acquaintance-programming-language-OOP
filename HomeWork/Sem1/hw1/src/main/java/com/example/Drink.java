package com.example;

public class Drink {
    private String name;
    private int volume;
    private int price;

    public Drink(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        
        return String.format("Название - %s, Объём - %d, Цена - %d ", name, volume, price);
    }
}
