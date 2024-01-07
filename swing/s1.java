import javax.swing.*;
public class s1{
    public static void main(String args[])
    {
        JFrame f1=new JFrame("Swing Frame");
        JLabel l1=new JLabel("This is my Label");
        l1.setBounds(20,30,100,150);
        f1.add(l1);
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}