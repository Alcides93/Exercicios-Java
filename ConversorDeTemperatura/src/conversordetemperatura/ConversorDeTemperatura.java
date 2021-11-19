/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordetemperatura;

import java.util.Scanner;

/* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius. 
public class ConversorDeTemperatura */

public class ConversorDeTemperatura{
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int tempCel;
        int tempFah;
        
        System.out.println("Digite a temperatura em Graus Celsius: ");
        tempCel = tec.nextInt();
        
        tempFah = (9 * tempCel + 160)/5;
        
        System.out.println("A temperatatura convertida em Fahrenheit é: " + tempFah );
        
    }
    
}
