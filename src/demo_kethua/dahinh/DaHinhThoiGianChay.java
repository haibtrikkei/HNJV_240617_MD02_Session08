package demo_kethua.dahinh;

import demo_kethua.Person;
import demo_kethua.employee.Employee;
import demo_kethua.student.Student;

import java.util.Scanner;

public class DaHinhThoiGianChay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1, person2, person3;

        person1 = new Person();
        person2 = new Student();
        person3 = new Employee();

        person1.input(scanner);
        person2.input(scanner);
        person3.input(scanner);

        System.out.println("Person 1: ");
        person1.display();

        System.out.println("Person 2: ");
        person2.display();

        System.out.println("Person 3: ");
        person3.display();

    }
}
