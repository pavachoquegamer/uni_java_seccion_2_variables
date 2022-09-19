
import java.util.Scanner;

//mi clase java
public class HolaMundo {
    public static void main (String args[]){
        System.out.println("Escribe tu nombre : ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario: " + usuario);
        System.out.println("Escribe el titulo : ");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo +" " + usuario);
        
        
        
        /*========================================================*/
        /*
        var nombre = "karla";
        System.out.println("nueva linea \n" + nombre);
        System.out.println("nuevo tabulador \t" + nombre);
        System.out.println("retroceso: \b\b" + nombre);
        System.out.println("Comilla simple \'" + nombre + "\'");
        System.out.println("Comilla simple \"" + nombre + "\"");
        */
        /*========================================================*/
        /*
        var usuario = "Andres";
        var titulo = "Ingeniero";
        
        var union = titulo +" " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println( i+ j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        */
                
    }
}
