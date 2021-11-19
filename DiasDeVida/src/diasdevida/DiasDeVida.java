/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasdevida;
// Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class DiasDeVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int idade;
        int dias;
        
        System.out.println("Digite sua idade: ");
        idade = tec.nextInt();
        dias = idade * 365;
        
        System.out.println("Você já viveu " + dias + " dias.");
      
        
        
}
}
