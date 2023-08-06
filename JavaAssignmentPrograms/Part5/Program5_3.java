
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program5_3 extends JFrame{

    JPanel panel = new JPanel();
    Program5_3(){
        setTitle("KeyEvents");
        setBounds(480,150,480,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setBounds(530,200,200,100);
        panel.setBackground(Color.WHITE);
        JLabel label = new JLabel("PRESS ANY KEY TO CHANGE THE COLOR");
        panel.add(label);
        add(panel);
        this.addKeyListener(new KeyAction());
        setVisible(true);
    }

    private class KeyAction extends KeyAdapter{
        public void keyTyped(KeyEvent ke){
            panel.setBackground(Color.RED);
        }
        public void keyPressed(KeyEvent ke){
            panel.setBackground(Color.YELLOW);
        }
        public void keyReleased(KeyEvent ke){
            panel.setBackground(Color.WHITE);
        }
    }
    public static void main(String[] args) {
        new Program5_3();
    }
}
