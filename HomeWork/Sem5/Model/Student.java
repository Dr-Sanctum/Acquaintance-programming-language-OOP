package HomeWork.Sem5.Model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<LocalDate, Boolean> attendanceLog = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Имя - %s", name);
    }
    public String getName() {
        return name;
    }

    public Map<LocalDate, Boolean> getAttendanceLog() {
        return attendanceLog;
    }

    public void addАttendanceMark(LocalDate date, Boolean mark) {
        attendanceLog.put(date, mark);
    }
}
