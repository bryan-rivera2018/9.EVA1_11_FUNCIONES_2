/*
 * se le pide al usuario el nombre para despues imprimirlo con un saludo
 */
package eva1_11_funciones_2;

import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_11_FUNCIONES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //LLAMAR A LA FUNCION
        SaludaUsuario();
        
        //ejemplo 2
        String sNombre = CapturaNombre();
        ImprimeSaludo(sNombre);
        //simplificado
        ImprimeSaludo(CapturaNombre());
        
    }
    //necesitamos una funcion salude
    public static void SaludaUsuario(){
        Scanner input = new Scanner (System.in);
        System.out.println("Cual es tu nombre: ");
        String sCade = input.nextLine();
        System.out.println("Hola " + sCade);
    }
    //Saludo separado
    //funcion para capturar el nombredel usuario y regresarlo
    public static String CapturaNombre(){
        Scanner input = new Scanner (System.in);
        System.out.println("Cual es tu nombre: ");
        String sCade = input.nextLine();
        return sCade;
    }
    //funcion para imprimir un saludo
    public static void ImprimeSaludo(String nombre){
        System.out.println("Hola " + nombre);
    }
    
}
