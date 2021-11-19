/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixa;

import java.util.Scanner;

/* Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve
receber do a informação de quantos produtos o cliente comprou e, para cada produto, deverá ler o seu preço.
Ao final, deverá informar quanto o cliente deve pagar pelas compras.*/
/**
 *
 * @author Alcid
 */
public class Caixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int i, qtdProdutos;
        double precoProduto, precoTotal;
        precoTotal = 0;
        
        System.out.println("Digite a quantidade de produtos: ");
        qtdProdutos = tec.nextInt();
        
        for(i = 1; i <= qtdProdutos; i++){
            System.out.println("Digite o preco do produto: " + i + ": ");
            precoProduto = tec.nextDouble();
            precoTotal += precoProduto;
        }System.out.println("O preço total é: " + precoTotal);
        
        
    }
    
}
