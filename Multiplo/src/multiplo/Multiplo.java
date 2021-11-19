/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplo;
// Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int num;
        System.out.println("Digite um numero: ");
        num = tec.nextInt();
        if( num % 5 == 0){
            System.out.println("O numero " + num + " é multiplo de 5.");
        }else{
            System.out.println("O numero " + num + " NÃO é multiplo de 5.");
        }
        
    }
    
}
