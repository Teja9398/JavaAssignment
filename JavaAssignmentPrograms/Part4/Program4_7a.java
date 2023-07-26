import javax.swing.*;
import java.awt.*;

public class Program4_7a{
    public static void main(String[] args) {
        JFrame frame =new JFrame("Traffic lights");
        frame.setBounds(400,200,300,350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel red=new JPanel();
        red.setBackground(Color.BLACK);
        red.setBounds(100,50,50,60);

        JPanel yellow=new JPanel();
        yellow.setBackground(Color.BLACK);
        yellow.setBounds(100,130,50,60);

        JPanel green=new JPanel();
        green.setBackground(Color.BLACK);
        green.setBounds(100,210,50,60);

        JRadioButton rb=new JRadioButton("red");
        rb.setBounds(170,50,100,50);

        JRadioButton yb=new JRadioButton("yellow");
        yb.setBounds(170,130,100,50);
        
        JRadioButton gb=new JRadioButton("Green");
        gb.setBounds(170,210,100,50);

        ButtonGroup group=new ButtonGroup();
        group.add(rb);
        group.add(yb);
        group.add(gb);


        frame.add(red);
        frame.add(yellow);
        frame.add(green);
        frame.add(rb);
        frame.add(yb);
        frame.add(gb);
        
        frame.setVisible(true);
        
        rb.addActionListener(e->{
            if(rb.isSelected()){
                green.setBackground(Color.BLACK);
                red.setBackground(Color.RED);
                yellow.setBackground(Color.BLACK);
            }
                
        });
        yb.addActionListener(e->{
            if(yb.isSelected()){
                green.setBackground(Color.BLACK);
                red.setBackground(Color.BLACK);
                yellow.setBackground(Color.YELLOW);
            }
                           
        });
        gb.addActionListener(e->{
            if(gb.isSelected()){
                green.setBackground(Color.green);
                red.setBackground(Color.BLACK);
                yellow.setBackground(Color.BLACK);
            }
        });
    }
}