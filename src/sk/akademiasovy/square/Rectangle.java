package sk.akademiasovy.square;

public class Rectangle {
    private double a;
    private double b;


    public Rectangle (double value){           //konstruktor ma rovnaky nazov ako CLASS
        a=value;
        b=value;
    }

    public Rectangle () {          //toto je tiez konstruktor
        a=0;
        b=0;
    }

    public Rectangle (double value, double value1 ){           //konstruktor ma rovnaky nazov ako CLASS
        a=value;
        b=value1;
    }

    public double getArea(){
        return a*b;
    }

    public double getPerimeter(){
        return 2*a+2*b;
    }

    public double getDiagonal() {
        return Math.sqrt(a*a+b*b);
    }

    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }


}