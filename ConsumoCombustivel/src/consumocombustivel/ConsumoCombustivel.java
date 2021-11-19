/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumocombustivel;

import java.util.Scanner;

/*Escrever um programa para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o total de
combustível gasto. */

public class ConsumoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        double taxaDeConsumo;
        double km1;
        double km2;
        double kmTotal;
        double litros;
        
        System.out.println("Informe o KM inicial: ");
        km1 = tec.nextDouble();
        
        System.out.println("Informe o KM final: ");
        km2 = tec.nextDouble();
        
        System.out.println("Informe a quatidade de litros consumidos: ");
        litros = tec.nextDouble();
        
        kmTotal = km1 - km2;
        taxaDeConsumo = kmTotal/litros;
        
        System.out.println("O total percorrido foi de " + kmTotal + " km");
        System.out.println("A taxa media de consumo é de " + taxaDeConsumo + " litros por Km percorrido");
    }
    
}
