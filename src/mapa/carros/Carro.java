package mapa.carros;

import mapa.motores.IMotor;

/**
 *
 * @author Juliano Zanella
 */
public abstract class Carro{
    
    private final int numeroPortas;
    private String cor;
    private final IMotor motor;

    public Carro(int numeroPortas, String cor, IMotor motor) {
        this.numeroPortas = numeroPortas;
        this.cor = cor;
        this.motor = motor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public IMotor getMotor(){
        return motor;
    }
    
    public void acelerar(){
        motor.acelerar();
    }
    
    public void parar(){
        System.out.println("Parou");
    }
    
    protected String boolToString(boolean booleano){
        if(booleano){
            return "Sim";
        }else{
            return "Não";
        }
    }

    @Override
    public String toString() {
        return "\nCarro: " 
                + this.getClass().getSimpleName() 
                + ";\nPortas: "
                + numeroPortas
                + ";\nCor: "
                + cor
                + ";\n"
                + motor.toString();
    }
}
