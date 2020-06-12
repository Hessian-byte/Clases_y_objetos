import java.util.Random;

public class RuedaFortuna {

    private int[] casillas;

    Random rnum = new Random();

    public void inicializarRueda(int numeroCasillas){

        casillas = new int[numeroCasillas];
        for(int i=0;i<numeroCasillas;i++){
            casillas[i] = rnum.nextInt(10000);
        }

    }

    public int lanzarRueda(){
        return casillas[rnum.nextInt(casillas.length-1)];
    }
}
