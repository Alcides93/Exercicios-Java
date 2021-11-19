/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencianumero;

import java.util.Scanner;

/* Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
Encerre a execução quando um número negativo for digitado.*/
/**
 *
 * @author Alcid
 */
public class SequenciaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int num,soma;
        soma = 0;
        
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        while(num >= 0){
            soma = soma + num;
            System.out.println("Digite um numero: ");
            num = tec.nextInt();
        }System.out.println("A soma dos numeros é: " + soma);
                 
    }
    
}
