import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program4_7b {

    static int x1,y1,x2,y2;
    static String shape="";
    
    public static void main(String[] args) {
        JFrame frame =new JFrame("Draw a Shape");
        frame.setBounds(400,150,720,650);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel canvas = new JPanel(){
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(Color.WHITE);
                if(shape.equals("Line")){
                    g.drawLine(x1, y1, x2, y2);
                }else if(shape.equals("Rectangle")){
                    int width=Math.abs(x1-x2);
                    int height=Math.abs(y1-y2);
                    g.drawRect(x1,y1,width,height);
                }else if(shape.equals("Oval")){
                    int width=Math.abs(x1-x2);
                    int height=Math.abs(y1-y2);
                    g.drawOval(x1,y1,width,height);
                }
            }
        };
        canvas.setBounds(10,10,680,480);
        canvas.setBackground(Color.DARK_GRAY);
        
        
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                x1=e.getX();y1=e.getY();
                x2=e.getX();y2=e.getY();
                canvas.repaint();
                // System.out.println(x+" "+y);
            } 
        });

        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me){
                x2=me.getX();y2=me.getY();
                // System.out.println(x2 +" "+ y2);
                canvas.repaint();
            }
        });

        JRadioButton lb=new JRadioButton("Line"); 
        lb.setBounds(130, 500, 100, 50);
        lb.addActionListener(e->{shape="Line";});
        JRadioButton rb=new JRadioButton("Rectangle"); 
        rb.addActionListener(e->{shape="Rectangle";});
        rb.setBounds(230, 500, 100, 50);
        JRadioButton ob=new JRadioButton("Oval"); 
        ob.addActionListener(e->shape="Oval");
        ob.setBounds(360, 500, 100, 50);

        ButtonGroup group = new ButtonGroup();
        group.add(lb);
        group.add(rb);
        group.add(ob);

        frame.add(canvas);
        frame.add(lb);
        frame.add(rb);
        frame.add(ob);

        frame.setVisible(true);
    }
}
