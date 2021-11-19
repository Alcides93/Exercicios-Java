/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raiopi;

import java.util.Scanner;

/* Escreva um programa para ler o raio de um circulo, calcular e escrever a sua
área. (pR²) */

public class RaioPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double area;
        double raio;
        double pi = 3.14;
        
        System.out.println("Digite o raio do circulo: ");
        raio = tec.nextDouble();
        
        area = pi * (raio * raio);
        
        System.out.println("A area do circulo é: " + area);
        
    }
    
}
