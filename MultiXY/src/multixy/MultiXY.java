/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multixy;

import java.util.Scanner;

/* Crie um algoritmo que lê dois números inteiros, X e Y, 
e mostre o resultado da multiplicação de x por y.*/
/**
 *
 * @author Alcid
 */
public class MultiXY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int x,y,mult;
        
        System.out.println("Digite um numero: ");
        x = tec.nextInt();
        
        System.out.println("Digite outro numero: ");
        y = tec.nextInt();
        
        mult = x * y;
        
        System.out.println("O resultado da multiplicação de " + x + " e " + y + " é: " + mult);
}
}
