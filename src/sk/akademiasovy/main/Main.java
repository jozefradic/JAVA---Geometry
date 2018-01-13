package sk.akademiasovy.main;

import sk.akademiasovy.geometry2D.Circle;
import sk.akademiasovy.geometry2D.Rectangle;
import sk.akademiasovy.geometry2D.Square;
import sk.akademiasovy.geometry2D.Triangle;
import sk.akademiasovy.geometry3D.Cube;
import sk.akademiasovy.geometry3D.RectangularPrism;
import sk.akademiasovy.geometry3D.Sphere;


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

        Triangle triangle = new Triangle ( 5, 8, 9);
        Triangle triangle1 = new Triangle();

        System.out.println("Area of triangle is "+ triangle.getArea() );
        System.out.println("Area of triangle1 is "+ triangle1.getArea() );
        System.out.println("Perimeter of triangle is "+ triangle.getPerimeter() );
        System.out.println("Perimeter of triangle1 is "+ triangle1.getPerimeter() );


        Circle circle1 = new Circle(8.5);

        System.out.println("Area of circle1 is "+ circle1.getArea() );
        System.out.println("Perimeter of circle1 is "+ circle1.getPerimeter() );

        Cube cube1 = new Cube (9.56);
        RectangularPrism rectangularPrism1 = new RectangularPrism(6.2, 8.65, 7.5);
        Sphere sphere1 = new Sphere(32.54);

        System.out.println("Surface of Cube is "+ cube1.getSurface() );
        System.out.println("Volume of Cube is "+ cube1.getVolume() );
        System.out.println("Surface of RectangularPrism is "+ rectangularPrism1.getSurface() );
        System.out.println("Volume of RectangularPrism is "+ rectangularPrism1.getVolume() );
        System.out.println("Surface of Sphere is "+ sphere1.getSurface() );
        System.out.println("Volume of Sphere is "+ sphere1.getVolume() );






    }
}
