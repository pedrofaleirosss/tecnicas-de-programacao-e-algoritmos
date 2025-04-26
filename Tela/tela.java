package javaapplication1;

import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame{
    
    public Tela(){
        setSize(800,600);
        setTitle("Minha primeira tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        Button botao = new Button("Clique aqui");
        botao.setBounds(0, 0, 100, 50);
        add(botao);
        
        Button botao2 = new Button("Clique aqui");
        botao2.setBounds(110, 0, 100, 50);
        add(botao2);
                
        setVisible(true);
    }
    
    public static void main (String[] args){
        new Tela();
    }
}