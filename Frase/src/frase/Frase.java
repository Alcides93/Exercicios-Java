/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frase;

import java.util.Scanner;

/* Crie um algoritmo que leia uma frase do usuário e escreva na 
tela exatamente o que o usuário digitar. */
/**
 *
 * @author Alcid
 */
public class Frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Esccreva uma frase: ");
        frase = tec.nextLine();
        System.out.println("A frase é: " + frase);
        
    }
    
}
