package mapa.carros;

import mapa.acessorios.ITetoSolar;
import mapa.motores.Motor_2_0;

/**
 *
 * @author Juliano Zanella
 */
public class Sentra extends Carro implements ITetoSolar{

    public boolean temTetoSolar = false;
    
    public Sentra(int numeroPortas, String cor, boolean temTetoSolar) {
        super(numeroPortas, cor, new Motor_2_0());
        this.temTetoSolar = temTetoSolar;
    }

    public boolean temTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }
    
    @Override
    public void abrirTetoSolar() {
        if(temTetoSolar){
            System.out.println("Abriu teto solar");
        }
    }

    @Override
    public void fecharTetoSolar() {
        if(temTetoSolar){
            System.out.println("Fechou teto solar");
        }
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ";\nTeto Solar: "
                + boolToString(temTetoSolar);
    }
}
