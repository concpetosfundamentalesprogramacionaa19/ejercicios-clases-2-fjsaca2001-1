/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class miejercicio {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int notas1;
        float promedio,notas2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese sus nombres: ");
        nombre = entrada.nextLine();
       
        System.out.println("Ingrese sus Apellidos: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese sus Edad: ");
        edad = entrada.nextInt();
        // Limpieza de buffer
        entrada.nextLine();
        
        System.out.println("Ingrese su Ciudad de origen: ");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese su Pais de origen: ");
        pais = entrada.nextLine();
        
        System.out.println("Ingrese sus Nota #1: ");
        notas1 = entrada.nextInt();
        
        System.out.println("Ingrese sus Nota #2: ");
        notas2 = entrada.nextInt();
        
        promedio=(notas1+notas2)/2;
   
        System.out.printf("Sus nombres y apellidos: %s %s \nEdad: %s \n "
                + "Ciudad: %s \nPais: %s \nNotas %s,%s \nPromedio: %s",nombre,
                apellido,edad,ciudad,pais,notas1,notas2,promedio);
    }
}