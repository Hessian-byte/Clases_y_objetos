import java.util.Random;

public class RuedaFortuna {

    private int[] casillas;

    Random rnum = new Random();

    public void inicializarRueda(int numeroCasillas) {
        if (verificarLargo(numeroCasillas)) {

            casillas = new int[numeroCasillas];
            for (int i = 0; i < numeroCasillas; i++) {
                casillas[i] = rnum.nextInt(10000);
            }
            System.out.println("Se ha creado la rueda de manera exitosa");
        } else {
            System.out.println("El número de casillas debe ser de entre 4 y 100");
        }
    }

    public int lanzarRueda() {
        try {
            return casillas[rnum.nextInt(casillas.length - 1)];
        } catch (Exception e) {
            System.out.println("La rueda todavía no se ha creado");
            return -1;
        }
    }

    public boolean verificarLargo(int numeroCasillas) {
        if (numeroCasillas <= 100 && numeroCasillas >= 4) {
            return true;
        } else {
            return false;
        }
    }
}
