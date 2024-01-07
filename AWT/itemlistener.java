//The Java ItemListener is notified whenever you click on the checkbox. It is notified against ItemEvent. The ItemListener interface is found in java.awt.event package. It has only one method: itemStateChanged().
import java.awt.*;
import java.awt.event.*;
public class itemlistener implements ItemListener{
    Checkbox checkBox1,checkBox2,checkBox3;
    Label label;
    itemlistener(){
        Frame f= new Frame("CheckBox");
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        checkBox1 = new Checkbox("Item1");
        checkBox1.setBounds(100,100, 50,50);
        checkBox2 = new Checkbox("Item2");
        checkBox2.setBounds(100,150, 50,50);
        checkBox3 = new Checkbox("Item3");
        checkBox3.setBounds(100,150, 50,50);
        f.add(checkBox1); f.add(checkBox2);f.add(checkBox3); f.add(label);
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==checkBox1)
            label.setText("Item1 Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
        if(e.getSource()==checkBox2)
            label.setText("Item2 Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
        if(e.getSource()==checkBox3)
            label.setText("Item3 Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
    }
    public static void main(String args[])
    {
        new itemlistener();
    }
}    