package mapa;

import java.util.ArrayList;
import java.util.List;
import mapa.carros.Carro;
import mapa.carros.Kicks;
import mapa.carros.March;
import mapa.carros.Sentra;
import mapa.carros.Versa;

/**
 *
 * @author Juliano Zanella
 */
public class Main {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new March(2, "Vermelho"));
        carros.add(new Versa(4, "Azul", true));
        carros.add(new Kicks(4, "Branco", true));
        carros.add(new Sentra(4, "Prata", true));
        
        for(Carro carro: carros){
            System.out.println(carro.toString());
            carro.acelerar();
            carro.parar();
        }
    }    
}
