package HomeWork.Sem5.Viewer;

import java.util.Scanner;

import HomeWork.Sem5.Presenter.Presenter;

public class AttendanceView {

    public static void getMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Введите номер пункта меню:\n");
        menu.append("1. Распечатать всех студентов и посещаемость каждого в процентах \n");
        menu.append("2. Распечатать студентов, отсортировав их по убыванию посещаемости\n");
        menu.append("3. Распечатать студентов с посещаемостью ниже 25%");
        System.out.println(menu.toString());
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println(Presenter.dataProcessing(scanner.nextLine()));
        scanner.close();
    }

}
