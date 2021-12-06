public class Cubo extends FiguraTridimensional {

    private double lado;
    private static final int caras = 6;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado = 1;
    }

    public abstract double CalcularVolumen {
        double volumen = Math.pow(lado, 3);
    }

    public abstract double CalcularSuperficie {
        double superficie = 6 * (Math.pow(lado, 2));
    }

    @Override
    public String toString() {
        return "La Figura es un Cubo";
    }
}
