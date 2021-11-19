/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcelas;

import java.util.Scanner;

/* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um programa que receba um valor de uma compra
e mostre o valor das prestações. */

public class Parcelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double valorCompra;
        double valorPrestacao;
        int parcelas = 5;
        
        System.out.println("Digite o valor do produto: ");
        valorCompra = tec.nextDouble();
        
        valorPrestacao = valorCompra/parcelas;
        
        System.out.println("O valor de cada parcela é de: " + valorPrestacao + " R$");
    }
    
}
