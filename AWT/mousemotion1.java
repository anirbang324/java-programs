import java.awt.*;
import java.awt.event.*;
public class mousemotion1 extends Frame implements MouseMotionListener{
    mousemotion1(){
        addMouseMotionListener(this);

        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.red);
        //g.fill(e.getX(),e.getY(),10,10);
        //g.clearRect;
    }
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new mousemotion1();
    }
}  