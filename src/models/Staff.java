package models;

public class Staff extends Member{
    int specialization;

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public Staff(String name, int age, double salary, double contact, int specialization) {
        super(name, age, salary, contact);
        this.specialization = specialization;
    }

    public void getsalary(int leaves){
        double salary = super.getSalary(leaves);
        double totalSalary = salary * specialization;
        System.out.println("Total Salary: " + totalSalary);
    }
}
