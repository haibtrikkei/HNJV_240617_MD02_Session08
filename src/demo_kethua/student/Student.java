package demo_kethua.student;

import demo_kethua.Person;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private String rollNumber;
    private String schoolName;
    private String className;

    public Student() {
    }

    public Student(String fullName, Boolean gender, Date birthday, String address, String rollNumber, String schoolName, String className) {
        super(fullName, gender, birthday, address);
        this.rollNumber = rollNumber;
        this.schoolName = schoolName;
        this.className = className;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void display() {
        System.out.println("Sinh viên: ");
        super.display();
        System.out.println("\tMã sinh viên: "+rollNumber);
        System.out.println("\tTên trường: "+schoolName);
        System.out.println("\tTên lớp: "+className);
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Nhập tên trường: ");
        schoolName = scanner.nextLine();
        System.out.println("Nhập tên lớp: ");
        className = scanner.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        rollNumber = scanner.nextLine();
    }
}
