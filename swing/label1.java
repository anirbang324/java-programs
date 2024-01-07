import javax.swing.*;
class label1{
    public static void main(String args[]){
        JFrame j1=new JFrame("My Label");
        JLabel l1,l2;
        l1=new JLabel("Label 1");
        l1.setBounds(50,50,100,30);
        l2=new JLabel("Label 2");
        l2.setBounds(50,100,100,30);
        j1.add(l1);
        j1.add(l2);
        j1.setSize(500,600);
        j1.setLayout(null);
        j1.setVisible(true);
    }
}