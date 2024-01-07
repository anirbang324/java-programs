import java.awt.*;
import java.awt.event.*;
public class  mouselistener2 extends Frame implements MouseListener{
        mouselistener2(){
        addMouseListener(this);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.GREEN);
        g.fillRect(e.getX(),e.getY(),15,15);
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new mouselistener2();
    }
}  