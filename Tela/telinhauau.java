
package aulatpa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AulaTPA extends JFrame{ //erança
    String nome = "";
    
    public AulaTPA(){ //construtor mesmo nome da classe
        setSize(800,600); //tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra quando aperta o x
        setLocationRelativeTo(null); //centraliza a janela
        setLayout(null); //desliga o layout automático
        
        Label rotulo = new Label("Digite seu nome:"); //texto
        rotulo.setBounds(100, 205, 200, 20); //medidas
        rotulo.setFont (new Font ("Verdana", Font.BOLD, 15)); //fonte
        rotulo.setForeground(Color.blue); //cor do texto
        add(rotulo);
                
        TextField caixa = new TextField(); //caixa de texto
        caixa.setBounds(100, 230, 200, 30); //medidas
        add(caixa);
        
        Button botao = new Button("Clique Aqui"); //botaum
        botao.setBounds(100, 265, 200, 30);
        add(botao);
        
        botao.addActionListener(new ActionListener() { //ação quando apertar o botão
            public void actionPerformed(ActionEvent e) {
                nome = caixa.getText(); //nome recebe oq foi escrito 
                
                JOptionPane.showMessageDialog(null, "Bem Vindo " + nome + "!"); //mensagem na tela
            }
        });
        
        
        
        
        Label numero1 = new Label("Primeiro Número:"); //texto
        numero1.setBounds(300, 205, 200, 20); //medidas
        numero1.setFont (new Font ("Verdana", Font.BOLD, 15)); //fonte
        numero1.setForeground(Color.magenta); //cor do texto
        add(numero1);
                
        TextField txtN1 = new TextField(); //caixa de texto
        txtN1.setBounds(300, 230, 200, 30); //medidas
        add(txtN1);
        
        
        
        Label numero2 = new Label("Segundo Número:"); //texto
        numero2.setBounds(500, 205, 200, 20); //medidas
        numero2.setFont (new Font ("Verdana", Font.BOLD, 15)); //fonte
        numero2.setForeground(Color.orange); //cor do texto
        add(numero2);
                
        TextField txtN2 = new TextField(); //caixa de texto
        txtN2.setBounds(500, 230, 200, 30); //medidas
        add(txtN2);
        
        
        Button botao_calc = new Button("Somar"); //botaum
        botao_calc.setBounds(300, 265, 400, 30);
        add(botao_calc);
        
        botao_calc.addActionListener(new ActionListener() { //ação quando apertar o botão
            public void actionPerformed(ActionEvent e) {
                int resultado, n1, n2; //variáveis para a conta
                
                n1 = Integer.parseInt(txtN1.getText()); //transforma o texto em numero
                n2 = Integer.parseInt(txtN2.getText());
                resultado = n1 + n2;
                
                JOptionPane.showMessageDialog(null, "A soma é " + resultado + " !"); //mensagem na tela
            }
        });
        
        setVisible(true); //sempre embaixo
    }

    public static void main(String[] args) {
        new AulaTPA(); //faz voltar pra classe
    }
}