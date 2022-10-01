package ejecutable;


import modelo.Carro;
import vista.VentanaPrincipal;
import controlador.controlador;


public class Test
{

    public static void main(String[] args) 
    {
            Carro carro1 = new Carro();
            carro1.setColor("Naranja");
            System.out.println("Pos. X: " + carro1.getPosX());
            System.out.println("Pos. Y: " + carro1.getPosY());
            System.out.println("Color: " + carro1.getColor());
            System.out.println("Num. Ruedas: " + carro1.getNumRuedas());
            System.out.println("Velocidad: " + carro1.getVelocidad());

            System.out.println("--------------------------------------");

            System.out.println(carro1);

            Carro carro2 = new Carro("Balnco", 10, 100);
            carro2.acelerar();
            System.out.println(carro2);

            Carro miCarro = null;
            VentanaPrincipal miVentana = new VentanaPrincipal();
            controlador micontrolador = new controlador(miVentana, miCarro);

    }

}

