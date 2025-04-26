package prova.tpa;
import java.util.Scanner;
public class ProvaTpa {

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

--------------------------------------------------------------

exc 2

package exc2;

import javax.swing.JOptionPane;

public class Exc2 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura."));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a profundidade."));
        int m3;
        int valor;
        
        m3 = n1 * n2 * n3;
        valor = 45 * m3;
        
        JOptionPane.showMessageDialog(null,"Valores fornecidos: " + n1 + ", " + n2 + ", " + n3 + "." + "\n" + 
                "A piscina solicitada tem " + m3 + " metros cubicos." + "\n" +
                "O valor da construção é de: R$" + valor,"Mensagem",1);
    }
    
}

----------------------------------------------------------

exc 3

package exc3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exc3 extends JFrame{

    public Exc3(){
        setSize(800,600);
        setTitle("Cadastro de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        
        
        Label codigo = new Label("Código");
        codigo.setBounds(20, 20, 200, 20);
        add(codigo);
        
        TextField codigotxt = new TextField();
        codigotxt.setBounds(20, 40, 100, 20);
        add(codigotxt);
        
        
        Label nome = new Label("Nome");
        nome.setBounds(250, 20, 200, 20);
        add(nome);
        
        TextField nometxt = new TextField();
        nometxt.setBounds(250, 40, 200, 20);
        add(nometxt);
        
        
        Label dt = new Label("Data de Nascimento");
        dt.setBounds(20, 70, 120, 20);
        add(dt);
        
        TextField dttxt = new TextField();
        dttxt.setBounds(20, 90, 150, 20);
        add(dttxt);
        
        
        Label cpf = new Label("CPF");
        cpf.setBounds(200, 70, 100, 20);
        add(cpf);
        
        TextField cpftxt = new TextField();
        cpftxt.setBounds(200, 90, 100, 20);
        add(cpftxt);
        
        
        Label identidade = new Label("Identidade");
        identidade.setBounds(380, 70, 100, 20);
        add(identidade);
        
        TextField identidadetxt = new TextField();
        identidadetxt.setBounds(380, 90, 100, 20);
        add(identidadetxt);
        
        
        Label cep = new Label("Cep");
        cep.setBounds(40, 180, 200, 20);
        add(cep);
        
        TextField ceptxt = new TextField();
        ceptxt.setBounds(40, 200, 100, 20);
        add(ceptxt);
        
        Button pesquisar = new Button("Pesquisar");
        pesquisar.setBounds(170, 200, 70, 20);
        add(pesquisar);
        
        
        Label logra = new Label("Logradouro");
        logra.setBounds(40, 240, 200, 20);
        add(logra);
        
        TextField logratxt = new TextField();
        logratxt.setBounds(40, 260, 300, 20);
        add(logratxt);
        
        
        Label num = new Label("Número");
        num.setBounds(400, 240, 100, 20);
        add(num);
        
        TextField numtxt = new TextField();
        numtxt.setBounds(400, 260, 100, 20);
        add(numtxt);
        
        
        Label com = new Label("Complemento");
        com.setBounds(550, 240, 200, 20);
        add(com);
        
        TextField comtxt = new TextField();
        comtxt.setBounds(550, 260, 100, 20);
        add(comtxt);
        
        
        Label bairro = new Label("Bairro");
        bairro.setBounds(40, 300, 50, 20);
        add(bairro);
        
        TextField bairrotxt = new TextField();
        bairrotxt.setBounds(40, 320, 250, 20);
        add(bairrotxt);
        
        
        Label mun = new Label("Município");
        mun.setBounds(320, 300, 100, 20);
        add(mun);
        
        TextField muntxt = new TextField();
        muntxt.setBounds(320, 320, 200, 20);
        add(muntxt);
        
        
        Label tel = new Label("Telefone");
        tel.setBounds(40, 360, 100, 20);
        add(tel);
        
        TextField teltxt = new TextField();
        teltxt.setBounds(40, 380, 200, 20);
        add(teltxt);
        
        
        Label cel = new Label("Celular");
        cel.setBounds(300, 360, 100, 20);
        add(cel);
        
        TextField celtxt = new TextField();
        celtxt.setBounds(300, 380, 200, 20);
        add(celtxt);
        
        
        
        Button cancelar = new Button("Cancelar");
        cancelar.setBounds(500, 500, 70, 20);
        add(cancelar);
        
        Button salvar = new Button("Salvar");
        salvar.setBounds(600, 500, 70, 20);
        add(salvar);
        
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Exc3();
    }  
}