/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariovendendor;

import java.util.Scanner;

/* Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês. */

public class SalarioVendendor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        String nomeVendendor;
        double salarioFixo;
        double vendas;
        double comissao;
        double salarioFinal;
        
        System.out.println("Digite o nome do vendendor: ");
        nomeVendendor = tec.nextLine();
        
        System.out.println("Digite o salario fixo do vendendor: ");
        salarioFixo = tec.nextDouble();
        
        System.out.println("Digite o total de vendas efetuadas pelo vendendor: ");
        vendas = tec.nextDouble();
        
        comissao = (vendas * 15)/100;
        salarioFinal = comissao + salarioFixo;
        
        System.out.println("Nome do vendendor: " + nomeVendendor );
        System.out.println("Salario Fixo: " + salarioFixo + "reais");
        System.out.println("Salario Final: " + salarioFinal + "reais");
    }
    
}
