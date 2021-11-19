/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma;

import java.util.Scanner;

/*Escrever um programa java que receba dois números e exiba o resultado da
sua soma. */

public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double n1;
        double n2;
        double soma;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = tec.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        n2 = tec.nextDouble();
        
        soma = n1 + n2;
        
        System.out.println("O resultado da soma é " + soma);
        
    }
    
}
