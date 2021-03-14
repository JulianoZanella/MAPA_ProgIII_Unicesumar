package mapa.motores;

/**
 *
 * @author Juliano Zanella
 */
public class Motor_2_0 implements IMotor{

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 2.0");
    }

    @Override
    public String toString() {
        return "Motor 2.0";
    }
}
