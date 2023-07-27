import javax.swing.*;
import java.awt.*;
public class Program4_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial");
        frame.setLayout(new FlowLayout());
        frame.setBounds(500,300,400,175);
        frame.setDefaultCloseOperation(3);

        frame.add(new JLabel("Enter a number"));
        JTextField tf1=new JTextField(20);
        frame.add(tf1);
        
        frame.add(new JLabel("Factorial of the number "));
        JTextField tf2=new JTextField(20);
        tf2.setEditable(false);
        frame.add(tf2);

        JButton b1=new JButton("Calculate");
        frame.add(b1);
        b1.addActionListener(e1->{
            int num=Integer.parseInt(tf1.getText());
            int fact=1;
            for(int i=num;i>0;i--){
                fact*=i;
            }
            tf2.setText(Integer.toString(fact));
        });


        frame.setVisible(true); 
    }
}
