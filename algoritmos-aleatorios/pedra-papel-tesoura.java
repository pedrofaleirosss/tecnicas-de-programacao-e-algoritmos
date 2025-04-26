package javaaaa;
import java.util.Scanner;
import java.util.Random;
public class Javaaaa {
    public static void main(String[] args) {
        
        Random sorte = new Random();
        Scanner leia = new Scanner(System.in);
        
        int numero = sorte.nextInt(3), pedra, papel, tesoura, rodada, pontos_usuario=0, pontos_computador=0;
        String escolha;
        
        for(rodada = 0; rodada <5; rodada++){
            System.out.println("Você escolhe Pedra, Papel ou Tesoura?");
            escolha = leia.next();

            switch(numero){
                case 0:
                    System.out.println("Pedra");
                    break;
                case 1:
                    System.out.println("Papel");
                    break;
                case 2:
                    System.out.println("Tesoura");
                    break;
            }

            if(escolha.equals("Pedra")){
                switch (numero){
                    case 0:
                    System.out.println("Empatou!");
                
                    case 1:
                    System.out.println("Perdeu!");
                    pontos_computador = pontos_computador + 1;
                
                    case 2:
                    System.out.println("Ganhou!");
                    pontos_usuario = pontos_usuario + 1;
                }
            }
            else if(escolha.equals("Papel")){
                switch (numero){
                    case 0:
                    System.out.println("Ganhou!");
                    pontos_usuario = pontos_usuario + 1;
                
                    case 1:
                    System.out.println("Empatou!");
                
                    case 2:
                    System.out.println("Perdeu!");
                    pontos_computador = pontos_computador + 1;
                }
            }
            else if(escolha.equals("Tesoura")){
                if(numero == 0){
                    System.out.println("Perdeu");
                    pontos_computador = pontos_computador + 1;
                }
                else if(numero == 1){
                    System.out.println("Ganhou!");
                    pontos_usuario = pontos_usuario + 1;
                }
                else{
                    System.out.println("Empatou!");
                }
            }
        }
        
        System.out.println("Pontos do usuário: " + pontos_usuario);
        System.out.println("Pontos do computador: " + pontos_computador);
        
    }
}
