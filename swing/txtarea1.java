package swing;

import javax.swing.*;
public class txtarea1 {
    txtarea1(){
        JFrame f1=new JFrame();
        JTextArea a=new JTextArea("Text Area");
        a.setBounds(10,30,200,50); //here 10 and 30 are the coordinates and 200 is width and 50 is height.
        f1.add(a);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);
    }public static void main(String[] args)
    {
        new txtarea1();
    }
}