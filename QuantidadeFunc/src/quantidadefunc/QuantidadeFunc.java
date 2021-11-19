/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quantidadefunc;

import java.util.Scanner;

/* Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e, para cada funcionário leia
seu nome e seu tempo de serviço (em meses). Se o funcionário possuir mais de 12 meses na empresa, escreva a
mensagem “<NOME> tem direito a férias”. Caso contrário, escreva a mensagem “<NOME> não tem direito a
férias”. Ao final, exiba quantos funcionários possuem direito a férias e quantos não possuem.*/
/**
 *
 * @author Alcid
 */
public class QuantidadeFunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i, qtdFunc, tempServ;
        String nome;
        
        System.out.println("Digite a quantidade de funcionarios: ");
        qtdFunc = tec.nextInt();
        for(i = 1; i <= qtdFunc; i++){
            System.out.println("Digite o nome do funcionário: ");
            nome = tec.nextLine() + tec.nextLine();
            System.out.println("Digite o tempo de serviço em meses: ");
            tempServ = tec.nextInt();
            
            if(tempServ >= 12){
                System.out.println(nome + " tem direito à férias.");
            }else{
                System.out.println(nome + " NÃO tem direito à férias.");
            }
        }
        
    }
    
}
