package swing;

import javax.swing.*;
public class tfld1 {
    public static void main(String[] args) {
        JFrame j1 = new JFrame("textField");
        JTextField t;
        t = new JTextField("Text");
        t.setBounds(130, 100, 100, 40);
        j1.add(t);
        j1.setSize(400, 400);
        j1.setLayout(null);
        j1.setVisible(true);
    }
}