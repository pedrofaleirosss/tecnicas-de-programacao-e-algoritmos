import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Float alunos[] = new Float[10];
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<=9; i++){
		    System.out.println("Digite a nota " + (i+1));
		    alunos[i] = leia.nextFloat();
		}
		for(int i=0; i<=9; i++){
		    if(alunos[i] >= 6){
		        System.out.println("A nota " + (i+1) + " do aluno é: " + alunos[i] + " e foi aprovado.");
		    }
		    else if(alunos[i] >= 0 && alunos[i] <4){
		        System.out.println("A nota " + (i+1) + " do aluno é: " + alunos[i] + " e foi reprovado.");
		    }
		    else if(alunos[i] >= 4 && alunos[i] < 6){
		        System.out.println("A nota " + (i+1) + " do aluno é: " + alunos[i] + " e ficou de recuperação.");
		    }
		}
	}
}