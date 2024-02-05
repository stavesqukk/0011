package models;

public class Cylinder extends Circle {
    int h;

     public int getH() {
         return h;
     }

     public void setH(int h) {
         this.h = h;
     }

     public Cylinder(int h, int radius) {
         super(radius);
         this.h = h;
     }

     public void getCylinderArea(){
         double a = this.getH();
         super.getRadius();
         super.getPi();
     }
 }
