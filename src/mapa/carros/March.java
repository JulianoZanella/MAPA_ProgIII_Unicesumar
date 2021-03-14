package mapa.carros;

import mapa.motores.Motor_1_0;

/**
 *
 * @author Juliano Zanella
 */
public class March extends Carro{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public March(int numeroPortas, String cor) {
        super(numeroPortas, cor, new Motor_1_0());
    }

    @Override
    public String toString() {
        return super.toString()
                + ";\nModelo: "
                + modelo;
    }
}
