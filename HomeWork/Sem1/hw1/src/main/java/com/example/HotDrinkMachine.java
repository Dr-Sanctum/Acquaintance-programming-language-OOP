package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * HotDrinkMachine
 */
public class HotDrinkMachine implements VendingMachine {

    private Map<Integer, Drink> drinks = new HashMap<>();
    private int number = 1;

    public void setProduct(HotDrink drink) {
        drinks.put(number, drink);
        number++;
    }

    @Override
    public void getProduct(String name, int volume) {
        Drink result = null;
        for (Drink drink : drinks.values()) {
            if (drink.getName() == name ||
                    drink.getVolume() == volume) {
                result = drink;
            }
        }
        System.out.println(String.format("Возьмите ваш напиток - %s, %d мл, оплатите %d руб.",
                result.getName(), result.getVolume(), result.getPrice()));
    }

    public void getProduct(String name, int volume, int temperature) {
        HotDrink result = null;
        for (Drink drink : drinks.values()) {
            if (drink.getName() == name ||
                    drink.getVolume() == volume ||
                    ((HotDrink)drink).getTemperature() == temperature) {
                result = ((HotDrink)drink);
            }
        }
        System.out.println(String.format("Возьмите ваш напиток - %s, %d мл, температура напитка - %d, оплатите %d руб.",
                result.getName(), result.getVolume(),result.getTemperature(), result.getPrice()));
    }

    @Override
    public void getAllProduct() {
        StringBuilder temp = new StringBuilder();
        for (Map.Entry<Integer, Drink> entry : drinks.entrySet()) {
            temp.append(entry.getKey());
            temp.append(" - ");
            temp.append(entry.getValue().toString());
            temp.append(" \n");
        }
        System.out.println(temp.toString());
    }

}