
package caja;

/**
 * 
 * @author Geovanny Zambrano
 */
public class Caja {
    private int Largo;
    private int Ancho;
    private int Profundo;
    
    public Caja(){
        
    }
    
    public Caja(int Largo, int Ancho, int Profundo){
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Profundo = Profundo;
        
    }
    
    // Metodos Get y Set
    //get
    public int getLargo(){
        return this.Largo;
    }
    public int getAncho(){
        return this.Ancho;
    }
    public int getProfundo(){
        return this.Profundo;
    }
    //set
    public void setLargo(int Largo){
        this.Largo = Largo;
    }
    public void setAncho(int Ancho){
        this.Ancho = Ancho;
    }
    public void setProfundo(int Profundo){
        this.Profundo = Profundo;
    }
    
    public int areaCaja(){
        int area;
        area = 6 * (Ancho*Largo);
        return area;
    }
    
    public int volumenCaja(){
        int volumen;
        volumen = (Ancho * Largo * Profundo);
        return volumen;
    }
        
}
