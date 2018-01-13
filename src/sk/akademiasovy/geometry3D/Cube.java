package sk.akademiasovy.geometry3D;

public class Cube implements Operation3D {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getSurface() {

        return 0;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }


}
