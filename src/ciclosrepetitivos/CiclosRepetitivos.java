/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;

import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class CiclosRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int i, n, suma;
        i = 1; n = 0; suma = 0;
        
        // Ingrese el limite de numeros
        System.out.println("Ingrese el limite de numeros a presentar");
        n = leer.nextInt();
        
        // Iniciamos el ciclo repetitivo while
        while (i <= n){
            System.out.println(i); 
            suma = suma + i;
            i = i + 1;
        }
        System.out.println("La suma de los numeros es: " +suma);
    }
}
