package circulo;

/**
 * Clase Circulo para probas en NetBeans 
 * Representa un circulo almacendando o seu radio e coordenadas
 * @author uadmin
 * @version 1.0.0
 */

public class Circulo {
    private int x;
    private int y;
    private double radio;

    /**
     *Constructor para a clase Circulo que asigna valores das
     * coordenadas x, y así como valor do radio
     * @param valorX Coordenada x enteiro 
     * @param valorY Coordenada y enteiro
     * @param valorRadio Radio en decimal
     */

    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * método que permite establecer coordenada x
     * @param valorX  Coordenada x enteiro
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Método que permite obter coordenada x
     * @return Coordenada x enteiro
     */
    public int obterX() {
        return x;
    }

    /**
     * Método que permite obter coordenada y
     * @param valorY Coordenada Y enterio
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Método que permite obter coordenada y
     * @return Coordenada y enteiro
     */
    public int obterY() {
        return y;
    }

    /**
     * Método que permite establecer o valor do radio
     * @param valorRadio Radio en decimal
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     *Método que permite obter o valor do radio
     * @return Radio en decimal
     */
    public double obterRadio() {
        return radio;
    }

    /**
     * Calcula o diametro do circulo
     * @return Diametro en decimal
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Calcula o perimetro en decimal
     * @return Perimetro en decimal
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Calcula a área do circulo
     * @return Área en decimal
     */
    public double obterArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
