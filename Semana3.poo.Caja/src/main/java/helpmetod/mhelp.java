package helpmetod;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *
 * @author Geovanny Zambrano
 */


public class mhelp {

    public static int solicitar_numero() throws IOException{
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int numero = 0;
        boolean repetir;
        
        System.out.println("Ingresa un numero.");
        
        do {
            try {
                numero = Integer.parseInt(br.readLine());
                repetir = false;
            } catch (NumberFormatException en_cuatro){
                System.out.println("El valor ingresado es incorrecto, intenta de nuevo");
                repetir = true;
            }
        } while (repetir);
        
        return numero;
    }
    
    public static boolean pregunta() throws IOException{
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String Texto = "";
        boolean repetir;
        
        boolean a = false;
        
        System.out.println("Quieres intentar de nuevo? (Si/No)");
        
        do {
            try {
                Texto = br.readLine();

                if (Texto.equalsIgnoreCase("Si")) {
                    repetir = false;
                    a = true;
                }
                else if (Texto.equalsIgnoreCase("No")){
                    repetir = false;
                    a = false;
                }
                else{
                    System.out.println("Solamente escribe \"Si\"  o \"No\"");
                    repetir = true;                
                }
            
            } catch (NumberFormatException en_cuatro){
                System.out.println("El valor ingresado es incorrecto, intenta de nuevo");
                repetir = true;
            }
        } while (repetir);
        
        return a;
    }
    
    public static char opcion(String literales) throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        char [] achar = literales.toCharArray();
        
        boolean comp = false;
        
        char a = ' ';
        
        System.out.println("Escoje un literal. (" + achar[0] + "-" + achar[achar.length-1] + ")");
        
        do {
            try{
                a = br.readLine().charAt(0);
                
                for (int i = 0; i < achar.length; i++) {
                if (a == achar[i]) {
                        comp = true;
                        mhelp.limpiarpantalla();
                    }
                }

                if (!comp) {
                    System.out.println("La opcion escojida no es correcta, Intenta de nuevo");
                }
                
            }
            catch (Exception en_cuatro){
                System.out.println("Hubo un error en la validacion. Intenta de nuevo");
            }
              
        } while (!comp);
        
        
        return a;
        
    }
     
     public static void limpiarpantalla() throws IOException, AWTException {
        String sistemaOperativo=System.getProperty("os.name");
    
        if(sistemaOperativo.contains("Windows")){
            try{
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }catch (Exception a){
                for (int i = 0; i < 30; i++) {
                    System.out.println("");
                }
            }
        }else if (sistemaOperativo.contains("nix") || sistemaOperativo.contains("nux") || sistemaOperativo.contains("aix")) {
            Runtime.getRuntime().exec("clear");
        }
        
    }   
    
    public static String text() throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String text = br.readLine();
        
        return text;
    }
    
}
