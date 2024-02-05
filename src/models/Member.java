package models;

public class Member {
    String name;
    int age;
    double salary;
    double contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public Member(String name, int age, double salary, double contact) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.contact = contact;
    }

    public double getSalary(int leaves){
        salary = salary-(leaves*1000);
        return salary;
    }
}
