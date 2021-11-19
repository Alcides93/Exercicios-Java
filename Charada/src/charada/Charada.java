/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charada;

import java.util.Scanner;

/* Escreva um algoritmo que simule um jogo de adivinhação com a pergunta “O que é, o que é? Quanto mais se
tira, mais a gente tem?”. O seu algoritmo deve encerrar apenas quando o usuário informar a resposta correta.
*/
/**
 *
 * @author Alcid
 */
public class Charada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        String resposta;
        System.out.println("Responda a pergunta: ");
        System.out.println("O que é, o que é? Quanto mais se tira, mais a gente tem? ");
        
        resposta = tec.next() + tec.nextLine();
        while (resposta.equals("fotografia") != true){
            System.out.println("Você errou... tente novamente: ");
            System.out.println("Responda a pergunta: ");
            System.out.println("O que é, o que é? Quanto mais se tira, mais a gente tem?");
            
            resposta = tec.next() + tec.nextLine();
        }
        System.out.println("Parabens, você acertou! Até a proxima.");
    }
    
}
