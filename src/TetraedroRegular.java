public class TetraedroRegular extends FiguraTridimensional {

    private double arista;

    private static final int caras = 4;

    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        this.arista = 1;
    }

    public double CalcularVolumen(){
        double volumen = (Math.pow(2, (1/2)) * ((Math.pow(arista, 3))/12));
        return volumen;
    }

    public double CalcularSuperficie(){
        double superficie = (Math.pow(3, (1/2))) * (Math.pow(arista, 2));
        return superficie;
    }

    @Override
    public String toString() {
        return "La Figura es un Tetraedro Regular";
    }
}
