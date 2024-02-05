package models;

public class Circle {

    int radius;
    double pi = 3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Circle(int radius){
        radius = this.radius;
    }

    public void getArea(){
        double a = this.getPi()*this.getRadius();
        System.out.println(a);
    }


}
