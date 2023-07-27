import javax.swing.*;
import java.awt.*;

public class Program4_8 {
    static int n1,n2;
    public static void main(String[] args) {
        JFrame frame=new JFrame("GCD");
        frame.setBounds(480,250,280,250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1=new JLabel("Num1");
        JLabel l2=new JLabel("Num2");
        JLabel l3=new JLabel("GCD");

        JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);
        JTextField t3=new JTextField(20);
        t3.setEditable(false);
        
        JButton gcd =new JButton("GCD");
        JButton clear=new JButton("Clear");
        JButton exit =new JButton("Exit");

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(gcd);
        frame.add(clear);
        frame.add(exit);

        gcd.addActionListener(e->{
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int ans=1;
            for(int i=2;i<Math.max(n1,n2);i++){
                if(n1%i==0&&n2%i==0){
                    ans=i;
                }
            }
            t3.setText(String.valueOf(ans));
        });
        clear.addActionListener(e->{
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        });
        exit.addActionListener(e->{System.exit(0);});

        frame.setVisible(true);
    }
}
