/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indicecorporal;

import java.util.Scanner;

/* Escreva um algoritmo que calcule o índice de massa corporal (IMC). O IMC é calculado pela
fórmula: IMC = peso / (altura *altura).*/
/**
 *
 * @author Alcid
 */
public class IndiceCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        float imc,peso,altura;
        
        System.out.println("Digite seu peso: ");
        peso = tec.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = tec.nextFloat();
        
        imc = peso/(altura * altura);
        
            System.out.println(" O seu IMC é:" + imc);
        }
    }
    

