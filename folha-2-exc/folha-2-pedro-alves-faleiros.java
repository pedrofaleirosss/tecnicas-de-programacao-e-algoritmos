// Lista de Exercícios 2 - Pedro Alves

// Exercício 1)

package folha.pkg2;
import java.util.Scanner;
public class Folha2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        String escolha;
        int num;
        
        System.out.println("Você escolhe crescente ou decresente?");
        escolha = leia.next();
        
        if(escolha.equals("crescente")){
            for(num = 1; num<101; num++){
                if(num == 100){
                    System.out.print(num + ".");
                    break;
                }
                System.out.print(num + ",");
            }
        }
        if(escolha.equals("decrescente")){
            for(num = 100; num>0; num--){
                if(num == 1){
                    System.out.print(num + ".");
                    break;
                }
                System.out.print(num + ",");
            }
        }
    }
}

// Exercício 2)

package folha.pkg2;
import java.util.Scanner;
import java.util.*;
public class Folha2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float aluno, nota1, nota2, nota3, nota4, media;
        
        for(aluno = 1; aluno <11; aluno++){
            System.out.println("Digite a nota 1");
            nota1 = leia.nextFloat();
            
            System.out.println("Digite a nota 2");
            nota2 = leia.nextFloat();
            
            System.out.println("Digite a nota 3");
            nota3 = leia.nextFloat();
            
            System.out.println("Digite a nota 4");
            nota4 = leia.nextFloat();
            
            media = (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("Sua média é " + media);
        }
    }
}

// Exercício 3)

package folha.pkg2;
import java.util.Scanner;
public class Folha2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float aluno , nota1, nota2, media, aprovados = 0;
        
        for(aluno = 1; aluno <= 20; aluno++){
            System.out.println("Digite a nota 1");
            nota1 = leia.nextFloat();
            
            System.out.println("Digite a nota 2");
            nota2 = leia.nextFloat();
            
            media = (nota1 + nota2)/2;
            System.out.println("Sua média é " + media);
            
            if(media >= 6){
                System.out.println("Você foi aprovado!");
                aprovados = aprovados + 1;
            }
            else{
                System.out.println("Você não foi aprovado. :(");
            }
        }
        
        System.out.println(aprovados + " alunos aprovados.");
        
    }
}

// Exercício 4)

package folha.pkg2;
import java.util.Scanner;
public class Folha2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float nalunos, alunos15 = 0, alunos16 = 0, alunos17 = 0, alunos18 = 0, porcentagem15, porcentagem16, porcentagem17, porcentagem18, media;
        String idade;
        
        for(nalunos = 0; nalunos <1000000000; nalunos++){
        System.out.println("Quantos anos você tem?");
        System.out.println("Digite stop para encerrar.");
        idade = leia.next();
        
            switch(idade){
                case "15": 
                    alunos15 = alunos15 + 1;
                    break;
                case "16":
                    alunos16 = alunos16 + 1;
                    break;
                case "17":
                    alunos17 = alunos17 + 1;
                    break;
                case "18":
                    alunos18 = alunos18 + 1;
                    break;
                case "stop":
                    break;
            }
            if(idade.equals("stop")){
                break;
            }
        }  
        
	media = ((alunos15 * 15) + (alunos16 * 16) + (alunos17 * 17) + (alunos18 * 18)) / nalunos;
        
        porcentagem15 = (alunos15/nalunos)*100;
        porcentagem16 = (alunos16/nalunos)*100;
        porcentagem17 = (alunos17/nalunos)*100;
        porcentagem18 = (alunos18/nalunos)*100;
        
        System.out.println(porcentagem15 + "% alunos com 15 anos.");
        System.out.println(porcentagem16 + "% alunos com 16 anos.");
        System.out.println(porcentagem17 + "% alunos com 17 anos.");
        System.out.println(porcentagem18 + "% alunos com 18 anos.");
	System.out.println("A média das idades é " + media + ".");
    }
}

// Exercício 5)

package folha.pkg2;
import java.util.Scanner;
public class Folha2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float funcionarios, salario, porcentagem = 0, reajuste, salarionovo;
        int codigo;
        
        System.out.println("Quantos funcionários terão o reajuste?");
        funcionarios = leia.nextFloat();
        
        for(funcionarios = funcionarios; funcionarios > 0; funcionarios--){
            
            System.out.println("Qual seu código?");
            codigo = leia.nextInt();
            System.out.println("Qual seu salário?");
            salario = leia.nextFloat();
            
            switch(codigo){
                case 1:
                    porcentagem = (float) 0.05;
                    break;
                case 2:
                    porcentagem = (float) 0.15;
                    break;
                case 3:
                    porcentagem = (float) 0.25;
                    break;
                case 4: 
                    porcentagem = (float) 0.30;
                    break;
            }
            reajuste = porcentagem * salario;
            salarionovo = salario + reajuste;
            
            System.out.println("O reajuste foi de " + reajuste + " reais.");
            System.out.println("Seu salário antigo era " + salario + " reais.");
            System.out.println("Seu salário novo é " + salarionovo + " reais.");
        }
    }
}

// Exercício 6) feito no gdb online a partir daqui

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int o1, o2, matrix = 0, senhor = 0, voto, pessoa;
		
		for(pessoa = 0; pessoa<20; pessoa++){
		    System.out.println("Qual é a melhor saga? 1-Matrix 2-Senhor dos Anéis");
		    voto = leia.nextInt();
		    
		    switch(voto){
		        case 1:
		            matrix = matrix + 1;
		            break;
		        case 2:
		            senhor = senhor + 1;
		    }
		}
		
		if(matrix > senhor){
		    System.out.println("Matrix venceu com um total de " + matrix + " votos." );
		    System.out.println("Senhor dos Anéis perdeu com " + senhor + " votos.");
		}
		else if(senhor > matrix){
		    System.out.println("Senhor dos Anéis venceu com um total de " + senhor + " votos.");
		    System.out.println("Matrix perdeu com " + matrix + " votos.");
		}
		else{
		    System.out.println("Empatou.");
		    System.out.println(matrix + " votos para Matrix.");
		    System.out.println(senhor + " votos para Senhor dos Anéis.");
		}
	}
}

// Exercício 7)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int numero, ndigitado, maior = -9999999, menor = 99999999;
		
		for(numero = 1; numero < 5; numero++){
		    System.out.println("Digite o número " + numero + ".");
		    ndigitado = leia.nextInt();
		    
		    if(ndigitado > maior){
		        maior = ndigitado;
		    }
		    else if(ndigitado < menor){
		        menor = ndigitado;
		    }
		}
		System.out.println("O maior número é " + maior + " e o menor número é " + menor + ".");
	}
}

// Exercício 8)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int numero, total = 0;
		
		for(numero = 1; numero < 101; numero++){
		    total = total + numero;
		}
		System.out.println("O total é " + total + ".");
	}
}

// Exercício 9)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Números ímpares de 0 à 50:");
		
		for(numero = 0; numero < 51; numero++){
		    if(numero % 2 != 0){
		        System.out.println(numero);
		    }
		}
	}
}

// Exercício 10)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int impar, soma = 0, par, multiplicacao = 0;
		
		for(impar=1; impar<=21; impar++){
		    if(impar % 2 != 0){
		        soma = soma + impar;
		    }
		}
		for(par=0; par<=20; par++){
		    if(par % 2 == 0){
		        multiplicacao = multiplicacao * par;
		    }
		}
		System.out.println("A soma dos números ímpares de 1 à 21 é " + soma + ".");
		System.out.println("A multiplicação dos números pares de 0 à 20 é " + multiplicacao + ".");
	}
}

// Exercício 11)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, fatorial, n;
		
		System.out.println("Digite um número.");
		numero = leia.nextInt();
		
		n = numero;
		fatorial = numero;
		
		for(numero = numero; numero > 1; numero--){
		    fatorial = fatorial * (numero - 1); 
		}
		
		System.out.println(n + "! é = " + fatorial + ".");
	}
}


// Exercício 12/13)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float base, expoente, potencia = 1, e;
		
		System.out.println("Qual será a base?");
		base = leia.nextFloat();
		
		System.out.println("Qual será o expoente?");
		expoente = leia.nextFloat();
		
		e = expoente;
		
		for(expoente = expoente; expoente > 0; expoente--){
		    potencia = potencia * base;
		}
		System.out.println("A potência de " + base + " elevado à " + e + " é " + potencia + ".");
	}
}

// FIM

