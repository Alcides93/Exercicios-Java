/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restodivisao;
// Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class RestoDivisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
         int x,y,resto;
         
         System.out.println("Digite um numero: ");
         x = tec.nextInt();
         System.out.println("Digite outro numero: ");
         y = tec.nextInt();
         resto = x % 2;
         
         System.out.println("O resto da divisao de " + x + " e " + y +" é: " + resto);
    }
    
}
