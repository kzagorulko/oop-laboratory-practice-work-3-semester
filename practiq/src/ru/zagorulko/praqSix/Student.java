package ru.zagorulko.praqSix;

public class Student {
    int iDNumber;
    int GPA;
    private Student[] students;

    public Student(int iDNumber, int GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void mergeSort(Student[] students) {
        this.students = students;
        int start = 0;
        int end = students.length - 1;
        sort(start, end);
        for (int i = 0; i < end + 1; i++)
            System.out.println(students[i]);
    }

    public void sort(int start, int end) {
        if(start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j)/2;
        while (i < j) {
            while (i < cur && (students[i].getiDNumber() <= students[cur].getiDNumber())) {
                i++;
            }
            while (j > cur && (students[cur].getiDNumber() <= students[j].getiDNumber())) {
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

    public void merge(Student[] students, Student[] students1) {
        for (int i = 0; i < students.length; i++)
            this.students[i] = students[i];
        int len = students.length;
        for (int i = 0; i < students1.length; i++)
            this.students[len+i] = students1[i];
        for (int i = 0; i < students.length + students1.length; i++)
            System.out.println(this.students[i]);
    }

    public static Student[] join(Student[] list1, Student[] list2) {
        Student[] temp = new Student[list1.length + list2.length];
        for(int i = 0; i < list1.length; i++) {
            temp[i] = list1[i];
        }
        for(int i = list1.length; i < list2.length + list1.length; i++) {
            temp[i] = list2[i - list1.length];
        }
        for(int i = 0; i < temp.length; i++) {
            temp[i].setiDNumber(i);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}