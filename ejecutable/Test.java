package ejecutable;

import controlador.Controlador;
import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args)
    {
        Mayor3Enteros miMayor3Enteros = new Mayor3Enteros();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, miMayor3Enteros);
    }
}
