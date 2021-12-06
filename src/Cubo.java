public class Cubo extends FiguraTridimensional {

    private double lado;
    private static final int caras = 6;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado = 1;
    }

    public double CalcularVolumen(){
        double volumen = Math.pow(lado, 3);
        return volumen;
    }


    public double CalcularSuperficie(){
        double superficie = 6 * (Math.pow(lado, 2));
        return superficie;
    }

    @Override
    public String toString() {
        return "La Figura es un Cubo";
    }
}
