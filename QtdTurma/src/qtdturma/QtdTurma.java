/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qtdturma;

import java.util.Scanner;

/* . Uma escola possui um determinado número de turmas. Crie um algoritmo que leia a quantidade de turmas
existentes na escola. Para cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua média no
semestre. Informe a média de cada uma das turmas.
*/
/**
 *
 * @author Alcid
 */
public class QtdTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int turmas,alunos,i,j;
        double mediaAluno,somaTurma,mediaTurma;
        somaTurma = 0;
        
        System.out.println("Digite a quantidade de turmas: ");
        turmas = tec.nextInt();
        
        for(i = 1; i <= turmas; i++){
            System.out.println("Digite a quantidade de alunos da turma: " + i + ": ");
            alunos = tec.nextInt();
            for(j = 1; j <= alunos; j++){
                System.out.println("Digite a média do aluno: " + j + ": ");
                mediaAluno = tec.nextDouble();
                somaTurma = somaTurma + mediaAluno;
            }
            mediaTurma = somaTurma / alunos;
            System.out.println("A média da turma " + i + " é: " + mediaTurma);
        }
    }
    
}
