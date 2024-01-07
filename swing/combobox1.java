import javax.swing.*;
public class combobox1 {
    JFrame f1;
    combobox1(){
        f1=new JFrame("ComboBox");
        String values[] = {"option1","Option2","Option3","Option4"};  //string array
        JComboBox cb=new JComboBox(values);
        cb.setBounds(50,50,90,20);
        f1.add(cb);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String args[]){
        new combobox1();
    }
}