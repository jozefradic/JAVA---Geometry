package sk.akademiasovy.geometry3D;

public class RectangularPrism implements Operation3D {
    private double a;
    private double b;
    private double c;

    public RectangularPrism(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
