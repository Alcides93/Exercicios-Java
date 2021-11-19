/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaturma;

import java.util.Scanner;

/* Escreva um algoritmo que leia a quantidade de alunos em uma turma. Em seguida, para cada aluno, leia a
informação de suas 2 notas, calcule a média e informe se o aluno está aprovado ou reprovado. O aluno está
aprovado apenas se a sua média for maio ou igual a 6.*/
/**
 *
 * @author Alcid
 */
public class MediaTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int  i,qtdAluno;
        double nota1,nota2,media;
        String aluno;
        
        System.out.println("Digite a quantidade de alunos da turma: ");
        qtdAluno = tec.nextInt();
        for(i = 1; i <= qtdAluno; i++){
            System.out.println("Digite o nome do aluno: ");
            aluno = tec.nextLine();
            System.out.println("Digite a 1° nota: ");
            nota1 = tec.nextDouble();
            System.out.println("Digite a 2° nota: ");
            nota2 = tec.nextDouble();
            media = (nota1 + nota2)/2;
            
            if(media >= 6){
                System.out.println("O " + aluno + " está APROVADO!");
            }else{
                System.out.println("O " + aluno + " está REPROVADO!");
            }
            
        }
        
    }
    
}
