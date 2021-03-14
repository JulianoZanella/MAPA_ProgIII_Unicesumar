package mapa.carros;

import mapa.acessorios.IFarolDeMilha;
import mapa.motores.Motor_1_6;

/**
 *
 * @author Juliano Zanella
 */
public class Kicks extends Carro implements IFarolDeMilha {

    private boolean temFarolDeMilha = false;
    
    public Kicks(int numeroPortas, String cor, boolean temFarolDeMilha) {
        super(numeroPortas, cor, new Motor_1_6());
        this.temFarolDeMilha = temFarolDeMilha;
    }

    public boolean temFarolDeMilha() {
        return temFarolDeMilha;
    }

    public void setTemFarolDeMilha(boolean temFarolDeMilha) {
        this.temFarolDeMilha = temFarolDeMilha;
    }
    
    @Override
    public void ligarFarolDeMilha() {
        if(temFarolDeMilha){
            System.out.println("Ligou farol de milha");
        }
    }

    @Override
    public void desligarFarolDeMilha() {
         if(temFarolDeMilha){
            System.out.println("Desligou farol de milha");
        }
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ";\nFarol de milha: "
                + boolToString(temFarolDeMilha);
    }
}
