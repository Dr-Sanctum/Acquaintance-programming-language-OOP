/**
 * Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.
 * 
 * Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и 
 * для каждой даты — посетил студент занятие или нет. Создайте класс AttendanceService (сервис посещаемости), 
 * в котором хранится информация обо всех студентах.
 * 
 * Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.
 * 
 * Создайте класс presenter со следующими функциями:
 * • Распечатать всех студентов и посещаемость каждого в процентах
 * • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
 * • Распечатать студентов с посещаемостью ниже 25%
 * 
 * Проверьте, как это работает.
 * @param <Т>
 */
package HomeWork.Sem5;

import java.time.LocalDate;

import HomeWork.Sem5.Model.AttendanceService;
import HomeWork.Sem5.Model.Student;
import HomeWork.Sem5.Viewer.AttendanceView;

public class Main {
    public static void main(String[] args) {
        //заполнение журналов студентов базовыми данными и помещение данных в группу
        {
        Student a = new Student("Вася");
        a.addАttendanceMark(LocalDate.of(2000, 1, 12), true);
        a.addАttendanceMark(LocalDate.of(2000, 1, 13), true);
        a.addАttendanceMark(LocalDate.of(2000, 1, 14), false);
        a.addАttendanceMark(LocalDate.of(2000, 1, 15), true);
        a.addАttendanceMark(LocalDate.of(2000, 1, 16), true);
        Student b = new Student("Петя");
        b.addАttendanceMark(LocalDate.of(2000, 1, 12), false);
        b.addАttendanceMark(LocalDate.of(2000, 1, 13), false);
        b.addАttendanceMark(LocalDate.of(2000, 1, 14), false);
        b.addАttendanceMark(LocalDate.of(2000, 1, 15), false);
        b.addАttendanceMark(LocalDate.of(2000, 1, 16), true);
        Student c = new Student("Ирина");
        c.addАttendanceMark(LocalDate.of(2000, 1, 12), true);
        c.addАttendanceMark(LocalDate.of(2000, 1, 13), true);
        c.addАttendanceMark(LocalDate.of(2000, 1, 14), true);
        c.addАttendanceMark(LocalDate.of(2000, 1, 15), true);
        c.addАttendanceMark(LocalDate.of(2000, 1, 16), true);
        Student d = new Student("Люцифер");
        d.addАttendanceMark(LocalDate.of(2000, 1, 12), false);
        d.addАttendanceMark(LocalDate.of(2000, 1, 13), true);
        d.addАttendanceMark(LocalDate.of(2000, 1, 14), true);
        d.addАttendanceMark(LocalDate.of(2000, 1, 15), false);
        d.addАttendanceMark(LocalDate.of(2000, 1, 16), false);
        AttendanceService.addStudent(a);
        AttendanceService.addStudent(b);
        AttendanceService.addStudent(c);
        AttendanceService.addStudent(d);
        }

        AttendanceView.getMenu();
    }
}
