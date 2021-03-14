package mapa.motores;

/**
 *
 * @author Juliano Zanella
 */
public class Motor_1_0 implements IMotor{

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 1.0");
    }
    
    @Override
    public String toString() {
        return "Motor 1.0";
    }
}
