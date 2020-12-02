package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr12p extends Applet {
    String[] namen;
    int[] nummers;
    TextField namen2;
    TextField nummers2;
    Button ok;
    boolean print;
    int teller = 0;

    public void init() {
        namen = new String[10];
        nummers = new int[10];
        namen2 = new TextField(20);
        nummers2 = new TextField(20);
        ok = new Button("ok");
        ok.addActionListener(new Knop());
        add(namen2);
        add(nummers2);
        add(ok);
        print = false;
    }

    public void paint(Graphics g) {
        int y = 50;
        if(print) {
            for(int i = 0; i < namen.length; i++) {
                y += 15;
                g.drawString( namen[i], 50, y);
            }
            for(int i = 0; i < nummers.length; i++) {
                y += 15;
                g.drawString( "" + nummers[i], 50, y);
            }
        }
    }

    class Knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(!print) {
                namen[teller] = namen2.getText();
                nummers[teller] = Integer.parseInt(nummers2.getText());
                teller++;
                if (teller >= 10) {
                    print = true;
                }
            }
            repaint();
        }
    }
}
