package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class achtpraktijk extends Applet {
    TextField left;
    TextField right;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    String uitkomst;
    public void init() {
        keer = new Button("*");
        keer.addActionListener(new Keer());
        delen = new Button("/");
        delen.addActionListener(new Delen());
        plus = new Button("+");
        plus.addActionListener(new Plus());
        min = new Button("-");
        min.addActionListener(new Min());
        setSize(50,50);
        left = new TextField("",10);
        right = new TextField("",10);
        add(left);
        add(right);
        add(keer);
        add(delen);
        add(plus);
        add(min);
    }
    public void paint(Graphics g) {
        g.drawString(uitkomst,50,50);
    }
    class Keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitkomst = left.getText();
        }
    }
    class Delen implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    class Min implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
