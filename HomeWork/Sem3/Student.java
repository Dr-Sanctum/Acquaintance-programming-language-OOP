package HomeWork.Sem3;

import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateBirstday;
    float averageRating;

    public Student(String name, LocalDate dateBirstday, float averageRating) {
    this.name = name;
    this.dateBirstday = dateBirstday;
    this.averageRating = averageRating;
    }

    @Override
    public String toString(){
        return String.format("Имя - %s, Дата рождения - " + dateBirstday +", Оценка - %f", name, averageRating);
    }
}
