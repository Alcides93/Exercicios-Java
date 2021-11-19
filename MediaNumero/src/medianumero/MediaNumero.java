/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medianumero;

import java.util.Scanner;

/* Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a média dos 15 números. Utilize o
comando de repetição Para (For).*/
/**
 *
 * @author Alcid
 */
public class MediaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i,num,soma;
        double media;
        soma = 0;
        
        for(i = 1; i <= 15; i++){
            System.out.println("Digite um numero: ");
            num = tec.nextInt();
            soma = soma + num;
            
        }
        media = soma-15.0;
        System.out.println("A media dos numeros digitados é: " + media);
        
    }
    
}
