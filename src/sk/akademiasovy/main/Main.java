package sk.akademiasovy.main;

import sk.akademiasovy.square.Rectangle;
import sk.akademiasovy.square.Square;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);  //prve je datovy typ ,druhe je premena lubovolneho mena,prikaz new je to iste ako maloc
        Square square2 = new Square();

        System.out.println("Area of square1 is "+ square1.getArea() );
        System.out.println("Perimeter of square1 is "+ square1.getPerimeter() );
        System.out.println("Diagonal's length of square1 is "+ square1.getDiagonal() );

        Rectangle rectangle = new Rectangle(9,3.5);
        Rectangle rectangle1 = new Rectangle();

        System.out.println("Area of rectangle is "+ rectangle.getArea() );
        System.out.println("Perimeter of rectangle is "+ rectangle.getPerimeter() );
        System.out.println("Diagonal's length of rectangle is "+ rectangle.getDiagonal() );


    }
}
