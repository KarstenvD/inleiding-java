package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdrachttwee extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button reset;

    public void init() {
        reset = new Button("reset text");
        reset.addActionListener(new KnopListenerr());
        label = new Label("typ iets in het textvakje");
        tekstvak = new TextField(s, 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        add(label);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }

        class KnopListenerr implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = "";
                repaint();

            }
        }
    }
