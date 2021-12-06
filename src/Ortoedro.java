public class Ortoedro extends FiguraTridimensional {

    private double ancho, base, altura;
    private static final int caras = 6;

    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    @Override
    public double CalcularVolumen(){
        double volumen = ancho * base * altura;
        return volumen;
    }
    @Override
    public double CalcularSuperficie(){
        double superficie = 2 * (ancho * base) + 2 * (ancho * altura) + 2 * (base * altura);
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }
}
