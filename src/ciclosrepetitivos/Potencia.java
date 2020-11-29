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
public class Potencia {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Programa que permita encontrar la potencia de un numero");
        //Declarar e iniializar las variables
         
         int base, pot, cont, result;
         base = 0; pot = 0; cont = 1; result = 1;

        //Ingresar los datos
        System.out.println("Ingresar la base de la potencia: ");
        base = leer.nextInt();
        
        System.out.println("Ingresar la potencia: ");
        pot = leer.nextInt();
        
        //Ciclo repetitivo que obtiene la potencia deun numero
        while (cont <= pot ){
            result = result * base;
            cont = cont + 1;
        }
        // Presentar el resultado
        System.out.println("La potencia es: " + base+ " elevado a " + pot+ " es: " +result);
     }
}
