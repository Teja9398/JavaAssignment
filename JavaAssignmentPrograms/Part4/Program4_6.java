import javax.swing.*;
import java.awt.*;

public class Program4_6 {

    int num1,num2;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,150,420,420);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Enter First Number ");
        JLabel l2=new JLabel("Enter secondNumber ");
        JTextField tf1=new JTextField(20);
        JTextField tf2=new JTextField(20);
        JButton btn=new JButton("Divide");
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(btn);


        frame.setVisible(true);
    }
}
