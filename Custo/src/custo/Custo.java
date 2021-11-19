/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custo;

import java.util.Scanner;

/* Faça um programa que receba o preço de custo de um produto e mostre o
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
acordo com um percentual informado pelo usuário.*/

public class Custo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        double acrescimo;
        double precoCusto;
        double valorVenda;
        
        System.out.println("Informe o preço de custo do produto: ");
        precoCusto = tec.nextDouble();
        
        System.out.println("informe a porcentagem de acréscimo: ");
        acrescimo = tec.nextDouble();
        
        valorVenda = (precoCusto * acrescimo)/100 + precoCusto;
        
        System.out.println("O valor da venda é R$: " + valorVenda);
        
    }
    
}
