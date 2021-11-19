/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero;

import java.util.Scanner;

/* Escreva um programa que entre com um número e o imprima caso seja maior
do que 20. */

public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        
        if(num >= 20){
            System.out.println("O numero " + num + " é maior que 20.");
        }else{
            if(num < 20){
                System.out.println("O numero " + num + " é menor que 20.");
            }
        }
    }
    
}
