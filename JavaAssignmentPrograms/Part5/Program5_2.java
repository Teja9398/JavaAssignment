
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program5_2 extends JFrame{
    JTextField tf = new JTextField(30);
    
    Program5_2(){
        setTitle("MouseEvents");
        setBounds(400,200,400,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tf.setSize(20,50);
        tf.setEditable(false);
        add(tf);
        MouseAction m = new MouseAction();
        this.addMouseListener(m);
        MouseAction1 m1 = new MouseAction1();
        this.addMouseMotionListener(m1);
        setVisible(true);
    }

    private class MouseAction extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            tf.setText("Mouse Clicked");
        }
        public void mousePressed(MouseEvent me){
            tf.setText("Mouse Pressed");
        }
        public void mouseReleased(MouseEvent me){
            tf.setText("Mouse Released");
        }
        public void mouseEntered(MouseEvent me){
            tf.setText("Mouse Entered");
        }
        public void mouseExited(MouseEvent me){
            tf.setText("Mouse Exited");
        }
    }
    class MouseAction1 extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent me){
            tf.setText("Mouse DRAGGED - ("+me.getX()+","+ me.getY()+")");
        }
        public void mouseMoved(MouseEvent me){
            tf.setText("Mouse MOVED - ("+me.getX()+","+ me.getY()+")");
        }
    }
    public static void main(String[] args) {
        new Program5_2();
        
    }
}