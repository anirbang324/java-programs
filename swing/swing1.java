import javax.swing.*;
public class swing1{
    public static void main(String args[]){
        JFrame f1=new JFrame();
        JButton b1 =new JButton("Press");
        b1.setBounds(130,100,100,40);

        f1.add(b1);

        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}

