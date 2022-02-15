package ru.skypro;


public class Main {

    public static void main(String[] args) {
//	Task 1
        System.out.println("Task 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName+ " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
// Task 2
        System.out.println("Task 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
// Task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        char newChar = 'е';
        char oldChar = 'ё';
        System.out.println("Данные ФИО сотрудника — " + fullName.replace(oldChar, newChar));
    }
}
