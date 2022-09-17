package modelo;

public class Mayor3Enteros
{
    //---------------------------
    // Atributos 
    //---------------------------
    private int x;
    private int y;
    private int z;
    private int mayor;

    //---------------------------
    // Metodos
    //---------------------------  
    public void setX(int pX)
    {
        this.x = pX;
    }  

    public void setY(int pY)
    {
        this.y = pY;
    } 

    public void setZ(int pZ)
    {
        this.z = pZ;
    } 

    public void hallarMayor()
    {
        if (x > y && x > z) {
            mayor = x;
        } else if (y > x && y > z) {
            mayor = y;
        } else {
            mayor = z;
        }   
    }  
    
    public int getMayor()
    {
        return mayor;
    }
}