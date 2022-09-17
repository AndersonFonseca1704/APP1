package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //------------------
    // Atributos
    //------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //------------------
    // Métodos
    //------------------

    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición contenedor de la ventana
        this.setLayout(null);

        //Creación y adición de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200);
        this.add(miPanelEntradaDatos);

        //Creación y adición de un panel tipo PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,480,60);
        this.add(miPanelOperaciones);

        //Creación y adición de un panel tipo PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,290,480,160);
        this.add(miPanelResultados);
        
        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}