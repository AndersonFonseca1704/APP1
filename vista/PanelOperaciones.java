package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;

public class PanelOperaciones extends JPanel
{
    //------------------
    // Atributos
    //------------------
    public JButton btHallarMayor;
    public JButton btBorrar;
    public JButton btSalir;

    //------------------
    // Métodos
    //------------------

    //Metodo constructor
    public PanelOperaciones()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear y agregar boton HallarMayor
        btHallarMayor = new JButton("Hallar Mayor");
        btHallarMayor.setBounds(7,20,150,20);
        btHallarMayor.setActionCommand("hallarMayor");
        this.add(btHallarMayor);

        //crear y agregar boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(164,20,150,20);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        //crear y agregar boton Borrar
        btSalir = new JButton("Salir");
        btSalir.setBounds(321,20,150,20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
}
