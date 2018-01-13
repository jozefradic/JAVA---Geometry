package sk.akademiasovy.geometry2D;

public class Triangle implements Operation {
        private double a;
        private double b;
        private double c;


        public Triangle (double value,double value1,double value2){           //konstruktor ma rovnaky nazov ako CLASS
            a=value;
            b=value1;
            c=value2;
        }

        public Triangle () {          //toto je tiez konstruktor
            a=3;
            b=4;
            c=5;
        }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
    @Override
    public double getArea() {
            double s=getPerimeter()/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public boolean isRectangular(){
            if(a*a+b*b==c*c)
                return true;
            else if(a*a+c*c==b*b)
                return true;
            else if(b*b+c*c==a*a)
                return true;
            else
                return false;
    }

    public boolean existsTriangle() {
        if(a+b>c)
            return true;
        else if(a+c>b)
            return true;
        else if(b+c>a)
            return true;
        else
            return false;
    }

    public boolean isStraightside() {
        if(a==c)
            return true;
        else if(a==b)
            return true;
        else if(b==c)
            return true;
        else
            return false;
    }

    public boolean isIsosceles() {
        if(existsTriangle() && a==b )
            return true;
        else if(existsTriangle() && b==c)
            return true;
        else if(existsTriangle() && c==a)
            return true;
        else
            return false;
    }
    //tu sprav metodu co overy ci sa da trojuholnik zostrojit to znamena porovnaj 2 strany kratke ci su dokopy dlh.ako najdlh.
}
