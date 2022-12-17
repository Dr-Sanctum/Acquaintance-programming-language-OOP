package com.example;

/**
 * При решении этих задач следуйте принципам абстракции, инкапсуляции,
 * наследования, полиморфизма.
 * 
 * Создайте унаследованный класс ГорячийНапиток с дополнительным полем int
 * температура.
 * 
 * Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат
 * и реализуйте перегруженный метод getProduct(int name, int volume, int
 * temperature),
 * выдающий продукт, соответствующий имени, объему и температуре.
 * 
 * В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков
 * и
 * позвольте покупателю купить товар.
 *
 */
public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 200, 20, 80);
        HotDrink coffee = new HotDrink("Coffee", 200, 35, 90);
        HotDrink cocoa = new HotDrink("Сocoa", 150, 15, 70);
        HotDrink chocolate = new HotDrink("Сhocolate", 100, 40, 80);
        HotDrinkMachine machine = new HotDrinkMachine();
        machine.setProduct(tea);
        machine.setProduct(coffee);
        machine.setProduct(cocoa);
        machine.setProduct(chocolate);

        machine.getAllProduct();

        machine.getProduct("Сocoa", 150);
        machine.getProduct("Сocoa", 150,70);
    }
}
