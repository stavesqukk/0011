import models.Circle;
import models.Member;
import models.Staff;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(5);
        c1.getArea();

        Member m1 = new Member("Muskan",24,12000,9841298);
        Staff s1 = new Staff("Muskan",24,12000,9841298, 2);
        s1.getsalary(11);
    }

}