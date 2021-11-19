/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroimpar;

import java.util.Scanner;

/* Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 e o
número informado pelo usuário.*/
/**
 *
 * @author Alcid
 */
public class NumeroImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int i,num;
        
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        System.out.println("Os numeros impares entre 1 e " + num + " são: ");
        for( i = 1; i <= num; i = i + 2){
            System.out.println(i);
        }
        
    }
    
}
