package sk.akademiasovy.square;

public class Square {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square (double value){           //konstruktor ma rovnaky nazov ako CLASS
        a=value;
    }

    public Square () {          //toto je tiez konstruktor
        a=0;
    }

    public double getArea(){
        return a*a;
    }

    public double getPerimeter(){
        return 4*a;
    }

    public double getDiagonal() {
        return Math.sqrt(a*a+a*a);
    }


}

