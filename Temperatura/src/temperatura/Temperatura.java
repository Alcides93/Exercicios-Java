/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/* Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do
clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, o clima é frio; se a
temperatura estiver entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35 graus, o
clima é quente; se a temperatura estiver acima de 35 graus, o clima é muito quente */
/**
 *
 * @author Alcid
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int temp;
        
        System.out.println("Informe a temperatura(C°) atual: ");
        temp = tec.nextInt();
        if(temp <= 18){
            System.out.println("O clima está Frio!");
        }else{
        if((temp > 18) && (temp <= 23)){
            System.out.println("O clima está agradável!");
        }else{
        if((temp > 23) && (temp <= 35)){
            System.out.println("O clima está quente!");
        }else{
            System.out.println("O clima está muito quente!");
        }   
        }
        }
        
    }
    
}
