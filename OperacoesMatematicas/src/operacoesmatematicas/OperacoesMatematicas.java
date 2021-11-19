/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoesmatematicas;

import java.util.Scanner;

/* Escreva um algoritmo que leia dois números e apresente um menu com 4 opções: 1) Somar os números; 2)
Subtrair os números; 3) Multiplicar os números; 4) Dividir os números. Leia a opção do usuário e execute a
operação e apresente o resultado. Caso a opção digitada seja inválida, apresente a mensagem de “Opção
inválida” para o usuário. */
/**
 *
 * @author Alcid
 */
public class OperacoesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int n1,n2,opcao,resultado;
        
        System.out.println("Digite um numero: ");
        n1 = tec.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = tec.nextInt();
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Somar ");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Multiplicar ");
        System.out.println("4 - Dividir ");
        opcao = tec.nextInt();
        switch (opcao){
            case 1:
                resultado = n1 + n2;
                System.out.println("O resultado da soma é: " + resultado);break;
            case 2:
                resultado = n1 - n2;
                System.out.println("O resultado da subtração é: " + resultado);break;
            case 3:
                resultado = n1 * n2;
                System.out.println("O resultado da multiplicação é: " + resultado);break;
            case 4:
                resultado = n1 / n2;
                System.out.println("O resultado da divisão é: " + resultado);break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
}
