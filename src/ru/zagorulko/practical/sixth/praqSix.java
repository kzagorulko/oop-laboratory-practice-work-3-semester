package ru.zagorulko.practical.sixth;

public class praqSix {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student(students.length - i, (int)Math.round(Math.random()*5));
            System.out.println(students[i]);
        }
        System.out.println('\n');
        // сортировка студентов по id
        students[0].mergeSort(students);

        // сортируем студентов по среднему баллу
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(students);
        sortingStudentsByGPA.sort(0, students.length-1);
        System.out.println('\n');

        // выводим студенотов отсортировнных по среднему баллу
        sortingStudentsByGPA.print();

        // добавление новых студентов
        Student[] students1 = new Student[4];
        System.out.println("\nНовые студенты:\n");
        for(int i = 0; i < students1.length; i++) {
            students1[i] = new Student(students1.length - i, (int)Math.round(Math.random()*5));
            System.out.println(students1[i]);
        }

        System.out.println("\nОбъединённый список:\n");
        students = Student.join(students, students1);
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }


}