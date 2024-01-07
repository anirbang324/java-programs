import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class factorial1 implements ActionListener {

    Button b1;
    TextField t1;
    Label lb1, lb3;
    Frame f;

    factorial1() {
        f = new Frame("Awt find factorial");

        lb1 = new Label("Enter a Number :");
        lb1.setBounds(5, 50, 150, 30);
        f.add(lb1);

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        lb3 = new Label("Result :");
        lb3.setBounds(90, 140, 150, 30);
        f.add(lb3);

        b1 = new Button("Find ");
        b1.setBounds(90, 200, 100, 30);
        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(t1.getText());
        int f = 1;
        if (e.getSource().equals(b1)) {

            for (int i = 1; i <= n; i++) {
                f = f * i;
            }

            lb3.setText(String.valueOf("Factorial is  :    " + f));
        }

    }

    public static void main(String args[]) {
        factorial1 t = new factorial1();
    }
}