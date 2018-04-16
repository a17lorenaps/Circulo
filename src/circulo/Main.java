package circulo;

import java.text.DecimalFormat;

/**
 * Clase Main para facer probas en NetBeans coa 
 * clase Circulo
 * @author uadmin
 */

public class Main {

    /**
     * Método main que da inicio a aplicación
     * @param args
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(37,43,2.5);
        String saida =
                "A coordenada X é "+circulo.obterX()+
                "\nA coordenada Y é "+circulo.obterY()+
                "\nO radio é "+circulo.obterRadio();
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);
        saida+="\n\nA nova ubicación e o radio de círculo son\n"+circulo.toString();
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(circulo.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(circulo.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(circulo.obterArea());
        System.out.println(saida);
        System.exit(0);
    }

}
