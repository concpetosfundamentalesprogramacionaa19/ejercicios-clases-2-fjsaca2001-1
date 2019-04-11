/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosz2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejemplosz21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // NO OLVIDAR INGRESAR VALORES 
        
        String nombre;
        
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese sus nombres: ");
        nombre = entrada.nextLine();
       
        System.out.println("Ingrese sus Apellidos: ");
        apellido = entrada.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t"+"Su apellido "
        +"es: "+apellido);
      
    }
    
}
