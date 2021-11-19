/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerodecrescente;

import java.util.Scanner;

/* Entrar com dois números eimprimi-los em ordem decrescente (suponha
números diferentes). */

public class NumeroDecrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Digite um numero: ");
        num1 = tec.nextInt();
        
        System.out.println("Digite outro numero diferente do primeiro: ");
        num2 = tec.nextInt();
        
        if(num1 > num2){
            System.out.println(+ num1 + " ... " + num2);
        }else{
            if(num1 < num2){
                System.out.println(+ num2 + " ... " + num1 );
            }
        }
    }
    
}
