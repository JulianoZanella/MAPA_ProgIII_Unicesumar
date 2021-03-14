package mapa.carros;

import mapa.acessorios.IMultimidia;
import mapa.motores.Motor_1_6;

/**
 *
 * @author Juliano Zanella
 */
public class Versa extends Carro implements IMultimidia {

    private boolean temMultimidia = false;

    public Versa(int numeroPortas, String cor, boolean temMultimidia) {
        super(numeroPortas, cor, new Motor_1_6());
        this.temMultimidia = temMultimidia;
    }

    public boolean temMultimidia() {
        return temMultimidia;
    }

    public void setTemMultimidia(boolean temMultimidia) {
        this.temMultimidia = temMultimidia;
    }

    @Override
    public void ligarMultimidia() {
        if(temMultimidia){
            System.out.println("Ligou a multimídia");
        }
    }

    @Override
    public void desligarMultimidia() {
       if(temMultimidia){
            System.out.println("Desligou a multimídia");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + ";\nMultimídia: "
                + boolToString(temMultimidia);
    }
}
