package sk.akademiasovy.geometry3D;

public class Sphere implements Operation3D {
    private double r;

    public Sphere(double r) {
        this.r = r;
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
