public class Main {
    public static void main(String[] args) {

        // Ortoedro
        Ortoedro ortoedro = new Ortoedro(1,7,8);
        System.out.println(ortoedro.toString());
        System.out.println("Superficie: " + ortoedro.CalcularSuperficie());
        System.out.println("Volumen: " + ortoedro.CalcularVolumen());

        // Cubo
        Cubo cubo = new Cubo(7);
        System.out.println(cubo.toString());
        System.out.println("Superficie: " + cubo.CalcularSuperficie());
        System.out.println("Volumen: " + cubo.CalcularVolumen());

        // TetraedroRegular
        TetraedroRegular tetraedroRegular = new TetraedroRegular(8);
        System.out.println(tetraedroRegular.toString());
        System.out.println("Superficie: " + tetraedroRegular.CalcularSuperficie());
        System.out.println("Volumen: " + tetraedroRegular.CalcularVolumen());
    }
}
