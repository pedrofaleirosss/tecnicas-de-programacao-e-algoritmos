
package aulinha_pre_prova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSecundaria extends JFrame{
    
    public TelaSecundaria(){
        setSize(1200,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        
        setVisible(true);
    }
}
