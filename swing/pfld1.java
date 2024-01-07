package swing;

import javax.swing.*;
public class pfld1 {
    public static void main(String[] args) {
        JFrame j1 = new JFrame("password");
        JPasswordField v1=new JPasswordField();
        JLabel l1=new JLabel("Enter Password:");
        l1.setBounds(20,100,80,30);
        v1.setBounds(100,100,100,30);
        j1.add(l1);
        j1.add(v1);
        j1.setSize(400, 400);
        j1.setLayout(null);
        j1.setVisible(true);
    }
}