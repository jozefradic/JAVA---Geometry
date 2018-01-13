package sk.akademiasovy.geometry2D;

public class Rectangle implements Operation, Diagonal {
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
    @Override
    public double getArea(){
        return a*b;
    }
    @Override
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