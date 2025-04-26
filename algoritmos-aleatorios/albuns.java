import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int  album, volume, volumem=0, faturamento, total=0;
		String nome="", nomem="";
		
		Scanner leia = new Scanner(System.in);
        
		for(album=0; album<600; album++)
		{
		    System.out.println("Digite o nome do álbum.");
		    nome = leia.next();
		    
		    System.out.println("Digite o valume de vendas.");
		    volume = leia.nextInt();
		    
		    System.out.println("Digite o valor do faturamento.");
		    faturamento = leia.nextInt();
		    
		    if(volume > volumem){
		        volumem = volume;
		        nomem = nome;
		   }
		   
		   total = total + volume;
		}
		
		System.out.println("O álbum mais vendido é " + nomem + " com um volume de "+ volumem + " vendas.");
		System.out.println("O total do volume de vendas é " + total);
		
	}
}