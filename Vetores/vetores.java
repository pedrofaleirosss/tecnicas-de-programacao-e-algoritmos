import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String alunos[] = new String[5];
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<=4; i++){
		    System.out.println("Entre com o nome do aluno " + (i+1));
		    alunos[i] = leia.next();
		}
		for(int i=0; i<=4; i++){
		    System.out.println("O aluno " + (i+1) + " se chama " + alunos[i]);
		}
	}
}