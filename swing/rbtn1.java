package swing;

import javax.swing.*;
public class rbtn1{
    JFrame f;
    rbtn1(){
        f=new JFrame();
        JRadioButton a1=new JRadioButton("Option 1");
        JRadioButton a2=new JRadioButton("Option 2");
        JRadioButton a3=new JRadioButton("Option 3");
        a1.setBounds(75,50,100,30);
        a2.setBounds(75,100,100,30);
        a3.setBounds(75,150,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(a1);
        bg.add(a2);
        bg.add(a3);
        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new rbtn1();
    }
}