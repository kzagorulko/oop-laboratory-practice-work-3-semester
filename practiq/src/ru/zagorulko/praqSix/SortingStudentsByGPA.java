package ru.zagorulko.praqSix;

public class SortingStudentsByGPA implements Comparator {
    Student[] students;

    public SortingStudentsByGPA(Student[] students) {
        this.students = students;
    }

    @Override
    public void sort(int start, int end) {
        if(start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j)/2;
        while (i < j) {
            while (i < cur && (students[i].getGPA() <= students[cur].getGPA())) {
                i++;
            }
            while (j > cur && (students[cur].getGPA() <= students[j].getGPA())) {
                j--;
            }
            if (i < j) {
                Student temp = new Student(students[i].getiDNumber(), students[i].getGPA());
                students[i] = students[j];
                students[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
            sort(start, cur);
            sort(cur+1, end);
        }
    }

    public void print() {
        for(int i = 0; i < students.length; i++)
            System.out.println(students[i]);
    }
}