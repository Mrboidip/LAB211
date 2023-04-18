/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0061;

/**
 *
 * @author xuank
 */
public class Rectangle extends Shape {
    
    private  double width;
    private double length;
    
    public Rectangle(double Width, double Length) {
        this.width = Width;
        this.length = Length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
         return 2 * (width + length);
    }
    @Override
    public double getArea() {
         return width * length;
                 
    }
      
   @Override
   public void printResult(){
    System.out.println("Rectangle:");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
   }
}

