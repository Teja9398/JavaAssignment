import javax.swing.*;
import java.awt.*;

public class Program4_5 {

    static int n1,n2;
    static char op;

    public static int calculate(int a,int b,char op){
        int result=0;
        switch(op){
            case '+':   
                    result=a+b;break;
            case '-':
                    result=a-b;break;
            case '*':
                    result=a*b;break;
            case '/':
                    result=a/b;break;
        }
        return result;
    }
    
    public static void main(String[] args) {
        //Frame
        JFrame frame=new JFrame("Calculator");
        frame.setBounds(400,150,400,600);
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //textfield
        JTextField tf1=new JTextField();
        tf1.setSize(400, 250);
        tf1.setEditable(false);
        Font font=new Font("Calibri",Font.BOLD,36);
        tf1.setFont(font);
        frame.add(tf1);

        //panel for buttons
        JPanel panel= new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4,4,2,2));
        panel.setSize(400, 400);
        panel.setBackground(Color.DARK_GRAY);

        //Buttons
        JButton num1=new JButton("1");
        panel.add(num1);
        JButton num2=new JButton("2");
        panel.add(num2);
        JButton num3=new JButton("3");
        panel.add(num3);
        JButton add=new JButton("+");
        panel.add(add);

        JButton num4=new JButton("4");
        panel.add(num4);
        JButton num5=new JButton("5");
        panel.add(num5);
        JButton num6=new JButton("6");
        panel.add(num6);
        JButton subtract=new JButton("-");
        panel.add(subtract);
        
        JButton num7=new JButton("7");
        panel.add(num7);
        JButton num8=new JButton("8");
        panel.add(num8);
        JButton num9=new JButton("9");
        panel.add(num9);
        JButton multiply=new JButton("X");
        panel.add(multiply);

        JButton num0=new JButton("0");
        panel.add(num0);
        JButton clear=new JButton("C");
        panel.add(clear);
        JButton divide=new JButton("/");
        panel.add(divide);

        JButton equals=new JButton("=");
        panel.add(equals);
        
        //number events
        num1.addActionListener(e->{
            tf1.setText(tf1.getText()+"1");
        });
        num2.addActionListener(e->{
            tf1.setText(tf1.getText()+"2");
        });
        num3.addActionListener(e->{
            tf1.setText(tf1.getText()+"3");
        });
        num4.addActionListener(e->{
            tf1.setText(tf1.getText()+"4");
        });
        num5.addActionListener(e->{
            tf1.setText(tf1.getText()+"5");
        });
        num6.addActionListener(e->{
            tf1.setText(tf1.getText()+"6");
        });
        num7.addActionListener(e->{
            tf1.setText(tf1.getText()+"7");
        });
        num8.addActionListener(e->{
            tf1.setText(tf1.getText()+"8");
        });
        num9.addActionListener(e->{
            tf1.setText(tf1.getText()+"9");
        });
        num0.addActionListener(e->{
            tf1.setText(tf1.getText()+"0");
        });
        
        //functional events
        add.addActionListener(e->{
           n1=Integer.parseInt(tf1.getText());
           tf1.setText(null);
            op='+';
        });
        subtract.addActionListener(e->{
           n1=Integer.parseInt(tf1.getText());
           tf1.setText(null);
            op='-';
        });
         multiply.addActionListener(e->{
           n1=Integer.parseInt(tf1.getText());
           tf1.setText(null);
            op='*';
        });
         divide.addActionListener(e->{
           n1=Integer.parseInt(tf1.getText());
           tf1.setText(null);
            op='-';
        });
         clear.addActionListener(e->{
           tf1.setText(null);
        });

        equals.addActionListener(e->{
            String res;
            n2=Integer.parseInt(tf1.getText());
            res=String.valueOf(calculate(n1,n2,op));
            tf1.setText(res);
        });
        
        frame.setVisible(true);

    }
}
