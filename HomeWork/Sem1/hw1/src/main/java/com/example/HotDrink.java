package com.example;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, int volume, int price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {

        return String.format("Название - %s, Объём - %d, Температура - %d Цена - %d ",
                super.getName(),
                super.getVolume(),
                temperature,
                super.getPrice());
    }
}
