/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadw;

/* Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Repita
(Do...While).*/
/**
 *
 * @author Alcid
 */
public class SomaDW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,soma;
        i = 1;
        soma = 0;
        
        do{
            soma = soma + i;
            i = i + 1;
        }while(i <= 15);
        System.out.println("A soma dos numeros de 1 a 15 é: " + soma);
    }
    
}
