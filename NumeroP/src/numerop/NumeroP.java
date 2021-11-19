/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerop;
// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class NumeroP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec  = new Scanner(System.in);
        int i,num,numP;
        numP = 0;
        
        for(i = 1; i <= 20; i++){
            System.out.println("Digite um numero: ");
            num = tec.nextInt();
            if (num % 2 == 0){
                numP++;
            }
        }System.out.println("A quantidade de numeros digitados que são pares são: " + numP);
        
    }
    
}
