/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadezw;

import java.util.Scanner;

/* Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de
repetição Enquanto (While) */
/**
 *
 * @author Alcid
 */
public class SomaDezW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i,num,soma;
        i = 1;
        soma = 0;
        while(i <= 10){
            System.out.println("Digite um numero: ");
            num = tec.nextInt();
            soma = soma + num;
            i = i + 1;
        }
        System.out.println("A soma dos numeros digitados é: " + soma);
        
    }
    
}
