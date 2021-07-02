package caja;

import helpmetod.mhelp;
import java.io.IOException;


/**
 * 
 * @author Geovanny Zambrano
 */
public class ejecutable {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Ingresa las medidas de la caja.");
                
        Caja Cubo = new Caja(pedirAncho(), pedirLargo(), pedirProfundo());
        
        System.out.println("----- Caja -----");
        System.out.println("Medidas...");
        System.out.println(" Ancho = " + Cubo.getAncho());
        System.out.println(" Largo = " + Cubo.getLargo());
        System.out.println(" Profundo = " + Cubo.getProfundo());
        System.out.println("-------------------");
        System.out.println(" Volumen = " + Cubo.volumenCaja());
        System.out.println(" Area = " + Cubo.areaCaja());
        
                
    }
    
    private static int pedirAncho() throws IOException{
        int a;
        System.out.println("Ingresa el Ancho");
        a = mhelp.solicitar_numero();
        return a;
    }
     private static int pedirLargo() throws IOException{
        int a;
        System.out.println("Ingresa el Largo");
        a = mhelp.solicitar_numero();
        return a;
    }
      private static int pedirProfundo() throws IOException{
        int a;
        System.out.println("Ingresa la Profundidad");
        a = mhelp.solicitar_numero();
        return a;
    }
   
}
