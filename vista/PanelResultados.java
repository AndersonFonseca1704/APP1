package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.Color;

public class PanelResultados extends JPanel
{
    //------------------
    // Atributos
    //------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //------------------
    // Metodos
    //------------------

    //Metodo constructor
    public PanelResultados()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,460,130);
        this.add(spResultado);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso a la informacion
    public void mostrarResultado(int mayor)
    {
        taResultado.setText("El numero mayor es: " + mayor);
        //taResultado.append("\nEl numero mayor es: " + mayor);
    }

    //Borrar
    public void borrar()
    {
        taResultado.setText("");
    }
}
