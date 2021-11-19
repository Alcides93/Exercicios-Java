/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somafor;

/* . Escreva um algoritmo que calcule a soma dos números de 1 a 15. 
Utilize o comando de repetição Para (For).*/
/**
 *
 * @author Alcid
 */
public class SomaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,soma;
        soma = 0;
        for(i = 1; i <= 15; i++){
            soma = soma + i;
        }System.out.println("A soma dos numeros de 1 a 15 é: " + soma);
    }
    
}
