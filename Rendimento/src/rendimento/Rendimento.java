/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rendimento;

import java.util.Scanner;

/* Faça um programa que receba um valor que foi depositado e exiba o valor
com rendimento após um mês.
Considere fixo o juro da poupança em 0.70% a. m. */

public class Rendimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double deposito;
        double juros;
        double rendimento;
        
        System.out.println("Digite o valor do deposito: ");
        deposito = tec.nextDouble();
        
        juros = (deposito * 0.70)/100;
        
        rendimento = juros + deposito;
        
        System.out.println("O redimento da poupança no mês foi de: " + rendimento + " R$");
    }
    
}
