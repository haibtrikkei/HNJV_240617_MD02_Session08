package demo_kethua;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String fullName;
    private Boolean gender;
    private Date birthday;
    private String address;

    public Person() {
    }

    public Person(String fullName, Boolean gender, Date birthday, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(Scanner scanner){
        System.out.println("Nhập họ tên: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập ngày sinh: ");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            birthday = sf.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập quê quán: ");
        address = scanner.nextLine();
    }

    public void display(){
        System.out.println("\tHọ tên: "+fullName);
        System.out.println("\tGiới tính: "+(gender?"male":"female"));
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\tNgày sinh: "+sf.format(birthday));
        System.out.println("\tQuê quán: "+address);
    }
}
