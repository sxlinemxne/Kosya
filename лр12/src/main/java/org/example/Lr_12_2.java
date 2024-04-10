package org.example;

public class Lr_12_2 {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Lr_12_2(String name) {
        this(name, "Unknown");
    }

    public Lr_12_2(String name, String surname) {
        this(name, surname, 0);
    }

    public Lr_12_2(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Unknown", 0.0);
    }

    public Lr_12_2(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " " + surname);
    }

    public void printInfo(boolean showSalary) {
        printInfo();
        if (showSalary) {
            System.out.println("Salary: " + salary);
        }
    }

    public void printInfo(boolean showSalary, boolean showExperience) {
        printInfo(showSalary);
        if (showExperience) {
            System.out.println("Experience: " + experienceInYears + " years");
        }
    }

    public static void greetTester() {
        System.out.println("Hello, Tester!");
    }

    @Override
    public String toString() {
        return "Lr_12_2{" + "Имя='" + name + '\'' + ", Фамилия='" + surname + '\'' + ", Опыт=" + experienceInYears + ", Уровень английского='" + englishLevel + '\'' + ", зарплата=" + salary +'}';
    }

    static class Main {
        public static void main(String[] args) {
            Lr_12_2 tester = new Lr_12_2("ИМЯ", "ФАМИЛИЯ", 5, "B2", 1000.0);
            System.out.println(tester);
        }
    }
}
