import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program4_7b {

    static int x,y,x2,y2;
    
    public void PaintComponent(Graphics g){
        g.drawLine(x, y, x2, y2);
    }
    public static void main(String[] args) {
        JFrame frame =new JFrame("Canvas");
        frame.setBounds(400,150,720,650);
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel canvas = new JPanel();
        canvas.setBounds(10,10,680,480);
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        
        

        canvas.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e){
                x=e.getX();y=e.getY();
           } 
           public void mouseReleased(MouseEvent e1){
                x2=e1.getX();y2=e1.getY();
            }
            
        });
        frame.setVisible(true);
    }
}
