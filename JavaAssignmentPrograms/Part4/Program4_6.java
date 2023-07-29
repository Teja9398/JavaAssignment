import javax.swing.*;
import java.awt.*;

public class Program4_6 {

    static int num1,num2;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,150,420,420);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Enter First Number ");
        JLabel l2=new JLabel("Enter secondNumber ");
        JLabel l3=new JLabel("Result");
        JTextField tf1=new JTextField(20);
        JTextField tf2=new JTextField(20);
        JTextField result=new JTextField(20);
        result.setEditable(false);
        JButton btn=new JButton("Divide");
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(btn);
        frame.add(l3);
        frame.add(result);

        btn.addActionListener(e->{
            JDialog dialog=new JDialog(frame, "Exception!!!");
            dialog.setBounds(500,250,200,200);
            try{
                num1=Integer.parseInt(tf1.getText());
                num2=Integer.parseInt(tf2.getText());
                result.setText(String.valueOf(num1/num2));
            }catch(NumberFormatException N){
                dialog.add(new JLabel("Enter only Integers."));
                dialog.setVisible(true);
            }catch(ArithmeticException ae){
                dialog.add(new JLabel("Cannot divide by zero"));
                dialog.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}
