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
public class VerificarPrimo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int cont, cont1, n, divisor, num;
        cont = 1; cont1 = 1; n = 0; divisor = 0; num = 0;
        
        System.out.println("Ingresa el limite de numero a verificar si son primos");
        n = leer.nextInt();
        
        while (cont <= n){
            
            System.out.println("Ingrese el numero a verificar");
            num = leer.nextInt();
            
            while (cont1 <= num){
                
                if (num % cont1 == 0){
                    divisor = divisor + 1;
                }
                cont1 = cont1 + 1;
            }
            if (divisor == 2){
                
                System.out.println(num + " es primo");
                System.out.println(" ---------");
            }
            else{
                System.out.println(num + " no es primo");
                System.out.println("---------");
            }
            cont1 = 1;
            divisor = 0;
            cont = cont + 1;
        }
    }
}
