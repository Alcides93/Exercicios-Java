/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proximonumero;
// Crie um algoritmo que leia um número inteiro e mostre seu sucessor.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class ProximoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int num;
        int proximo;
        
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        
        proximo = num + 1;
        
        System.out.println("O proximo numero é: " + proximo);
    }
    
}
