/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cotacaodolar;

import java.util.Scanner;

/* Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$
1 = R$ 5,48. */ 

/**
 *
 * @author Alcid
 */
public class CotacaoDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        double valorReal,valorDolar;
        
        System.out.println("Digite o valor em dolar: ");
        valorDolar = tec.nextDouble();
        valorReal = valorDolar * 5.48;
        
        System.out.println("O valor em real é: " + valorReal);
        
    }
    
}
