package HomeWork.Sem5.Presenter;

import java.util.Comparator;

import HomeWork.Sem5.Model.Student;

public class ComparatorStudents implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int markTrueo1 = 0;
        int markTrueo2 = 0;
        int percentMarkTrue1 = 0;
        int percentMarkTrue2 = 0;
        for (Boolean mark : o1.getAttendanceLog().values()) {
            if (mark) {
                markTrueo1++;
            }
        }
        for (Boolean mark : o2.getAttendanceLog().values()) {
            if (mark) {
                markTrueo2++;
            }
        }
        percentMarkTrue1 = markTrueo1 * 100
                / o1.getAttendanceLog().values().size();
        percentMarkTrue2 = markTrueo2 * 100
                / o2.getAttendanceLog().values().size();

        if (percentMarkTrue1 < percentMarkTrue2) {
            return 1;
        } else if (percentMarkTrue1 > percentMarkTrue2) {
            return -1;
        } else {
            return 0;

        }
    }
}
