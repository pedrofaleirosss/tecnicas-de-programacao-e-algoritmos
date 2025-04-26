import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Double alunos[] = new Double[10];
		Double media = 0.00;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<=9; i++){
		    System.out.println("Digite a nota " + (i+1));
		    alunos[i] = leia.nextDouble();
		    
		    media = media + alunos[i];
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
		media = media / 10;
		if(media >= 6){
		    System.out.println("Portanto sua média final foi " + media + " e está aprovado.");
		}
		else if(media >= 0 && media < 4){
		    System.out.println("Portanto sua média final foi " + media + " e está reprovado.");
		}
		else if(media >= 4 && media < 6){
		    System.out.println("Portanto sua média final foi " + media + " e está de recuperação.");
		}
	}
}