import javax.swing.*;
public class swing3 extends JFrame{
    JFrame j1;
    swing3(){
        JButton b1 =new JButton("Press");
        b1.setBounds(130,100,100,40);

        add(b1);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new swing3();
    }
}