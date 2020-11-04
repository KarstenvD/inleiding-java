package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class achtpraktijk extends Applet {
    TextField left;
    TextField right;
    Double getal;
    Double getal2;
    Double uitkomst;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    Button reset;
    String uitkomstfinal;
    public void init() {
        keer = new Button("*");
        keer.addActionListener(new Keer());
        delen = new Button("/");
        delen.addActionListener(new Delen());
        plus = new Button("+");
        plus.addActionListener(new Plus());
        min = new Button("-");
        min.addActionListener(new Min());
        reset = new Button("reset");
        reset.addActionListener(new Reset());
        setSize(50,50);
        left = new TextField("",10);
        right = new TextField("",10);
        uitkomstfinal = "uitkomst :";
        add(left);
        add(right);
        add(keer);
        add(delen);
        add(plus);
        add(min);
        add(reset);
    }
    public void paint(Graphics g) {
        g.drawString(uitkomstfinal,50,50);
    }
    class Keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String l = left.getText();
            String r = right.getText();
            getal = Double.parseDouble(l);
            getal2 = Double.parseDouble(r);
            uitkomst = getal * getal2;
            uitkomstfinal = "uitkomst :";
            uitkomstfinal += uitkomst;
            repaint();
        }
    }
    class Delen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String l = left.getText();
            String r = right.getText();
            getal = Double.parseDouble(l);
            getal2 = Double.parseDouble(r);
            uitkomst = getal / getal2;
            uitkomstfinal = "uitkomst :";
            uitkomstfinal += uitkomst;
            repaint();
        }
    }
    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String l = left.getText();
            String r = right.getText();
            getal = Double.parseDouble(l);
            getal2 = Double.parseDouble(r);
            uitkomst = getal + getal2;
            uitkomstfinal = "uitkomst :";
            uitkomstfinal += uitkomst;
            repaint();
        }
    }
    class Min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String l = left.getText();
            String r = right.getText();
            getal = Double.parseDouble(l);
            getal2 = Double.parseDouble(r);
            uitkomst = getal - getal2;
            uitkomstfinal = "uitkomst :";
            uitkomstfinal += uitkomst;
            repaint();
        }
    }
    class Reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitkomstfinal = "uitkomst :";
            left.setText("");
            right.setText("");
            repaint();
        }
    }
}
