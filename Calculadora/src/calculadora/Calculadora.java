/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

 /*Escrever um programa que receba dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos números lidos */

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double n1;
        double n2;
        double soma, subtracao, multiplicacao, divisao;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = tec.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = tec.nextDouble();
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtracao é: " + subtracao);
        System.out.println("O resultado da multiplicacao é: " + multiplicacao);
        System.out.println("O resultado da divisao é: " + divisao);
    }
    
}
