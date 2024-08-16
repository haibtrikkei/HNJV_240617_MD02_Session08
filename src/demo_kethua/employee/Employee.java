package demo_kethua.employee;

import demo_kethua.Person;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private String empId;
    private String company;
    private String department;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String fullName, Boolean gender, Date birthday, String address, String empId, String company, String department, String position, Double salary) {
        super(fullName, gender, birthday, address);
        this.empId = empId;
        this.company = company;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Nhân viên: ");
        super.display();
        System.out.println("\t Mã nhân viên: "+empId);
        System.out.println("\tCông ty: "+company);
        System.out.println("\tPhòng ban: "+department);
        System.out.println("\tVị trí: "+position);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("\tLương: "+nf.format(salary));
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Nhập tên công ty: ");
        company = scanner.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        empId = scanner.nextLine();
        System.out.println("Nhập phòng ban: ");
        department = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        salary = Double.parseDouble(scanner.nextLine());
    }
}
