
package aulinha_pre_prova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame{
    
    public TelaPrincipal(){
        setLayout(null);
        setSize(1200,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        
        Button botao = new Button("Clique Aqui!");
        botao.setBounds(350, 300, 500, 200);
        add(botao);
        
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new TelaSecundaria();
            }
        });
        
        setVisible(true);
    }
}
