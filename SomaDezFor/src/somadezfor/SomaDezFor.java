/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadezfor;

import java.util.Scanner;

/* Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de
repetição Para (For). */
/**
 *
 * @author Alcid
 */
public class SomaDezFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i,num,soma;
        soma = 0;
        
        for(i=1; i <= 10; i++){
            System.out.println("Digite um numero: ");
            num = tec.nextInt();
            soma = soma + num;
        }System.out.println("A soma dos numeros digitados é: " + soma);
        
    }
    
}
