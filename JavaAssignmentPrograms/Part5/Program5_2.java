
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program5_2 extends JFrame{
    JLabel label = new JLabel("Hello");
    JLabel label2 = new JLabel();
    
    Program5_2(){
        setBounds(400,200,720,720);
        // setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(label);
        add(label2);
        label.addMouseListener(new Mouse());
        label.addMouseMotionListener(new Mouse1());
        setVisible(true);
    }

    class Mouse extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            label.setText("Mouse Clicked");
        }
        public void mousePressed(MouseEvent me){
            label.setText("Mouse Pressed");
        }
        public void mouseReleased(MouseEvent me){
            label.setText("Mouse Released");
        }
    }
    class Mouse1 extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent me){
            label.setText("Mouse dragged from ("+me.getX()+","+ me.getY()+")");
        }
        // public void mouseMoved(MouseEvent me){
        //     label2.setText("Mouse Moved from ("+me.getX()+","+ me.getY()+")");
        // }
    }
    public static void main(String[] args) {
        new Program5_2();
        
    }
}