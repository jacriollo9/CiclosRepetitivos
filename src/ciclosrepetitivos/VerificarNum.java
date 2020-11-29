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
public class VerificarNum {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cont, n, num, SumPar, SumImpar, SumNeg, SumPos;
        cont = 1; n = 1; num = 0; SumPar = 0; SumImpar = 0; SumNeg = 0; SumPos = 0; 
        
        //Ingresa los datos de entrada limite
        
        System.out.println("Ingresa el limite de numeros a verificar: ");
        n = leer.nextInt();
        
        // Crear el ciclo para verificar los numeros 
        while (cont <= n){
            System.out.println("Ingresa el numero a verificar: ");
            num = leer.nextInt();
            if (num % 2 == 0 ){ //Verificar si un numero es par o impar
                SumPar = SumPar + num; //Suma los numeros pares 
            }
            else {
                SumImpar = SumImpar + num;
            }
            if (num > 0){
                SumPos = SumPos + num;
            }
            else {
                SumNeg = SumNeg + num;
            }
            cont = cont + 1;
            
            System.out.println("La suma de los pares es: "+SumPar);
            System.out.println("La suma de los impares es: "+SumImpar);
            System.out.println("La suma de los positivos es: "+SumPos);
            System.out.println("La suma de los negativos es: "+SumNeg);
        }
        System.out.println("La suma de los pares es: "+SumPar);
        System.out.println("La suma de los impares es: "+SumImpar);
        System.out.println("La suma de los positivos es: "+SumPos);
        System.out.println("La suma de los negativos es: "+SumNeg);
    }
}

