/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropn;
// Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class NumeroPN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        
        if(num < 0){
            System.out.println("O numero " + num + " é Negativo.");
        }else{
            System.out.println("O numero " + num + " é Positivo.");
        }
    }
    
}
