package swing;

import javax.swing.*;
public class chkbox1 {
    chkbox1(){
        JFrame f1=new JFrame("checkbox");
        JCheckBox c1=new JCheckBox("1");
        c1.setBounds(100,100,50,50);
        JCheckBox c2=new JCheckBox("2");
        c2.setBounds(100,150,50,50);
        f1.add(c1);
        f1.add(c2);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String[] args){
        new chkbox1();
    }
}