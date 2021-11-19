/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cotacao;

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class Cotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
         double real;
         double dolar;
         double cotacao;
         
         System.out.println("Digite a quantidade de dolar: ");
         dolar = tec.nextDouble();
         
         System.out.println("Digite a cotação do dolar: ");
         cotacao = tec.nextDouble();
         
         real  = dolar * cotacao;
         
         System.out.println("Quantia em reais: " + real + " R$");
    }
    
}
