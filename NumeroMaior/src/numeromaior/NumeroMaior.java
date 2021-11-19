/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromaior;
// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class NumeroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i,num,numM;
        numM = 0;
        
        for(i = 1; i <= 20; i++){
            System.out.println("Digite um numero");
            num = tec.nextInt();
            if(num > 8){
                numM++;
            }
        }
        System.out.println("A quatidade de numeros digitados maiores que 8 são: " + numM);
    }
    
}
