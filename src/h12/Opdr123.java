package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdr123 extends Applet {
    TextField[] tekstvakken;
    int[] getallen = new int[5];
    public void init() {
        tekstvakken = new TextField[5];

        for(int teller = 0; teller < tekstvakken.length; teller++) {
            tekstvakken[teller] = new TextField(20);
            tekstvakken[teller].addActionListener(new Tekstvakjes());
            add(tekstvakken[teller]);
        }
    }
    public void paint(Graphics g) {
    }
    class Tekstvakjes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int teller = 0; teller < getallen.length; teller++) {
                getallen[teller] = Integer.parseInt(tekstvakken[teller].getText());
            }
            Arrays.sort(getallen);
            for(int teller = 0; teller < getallen.length; teller++) {
                tekstvakken[teller].setText("" + getallen[teller]);
            }
            repaint();
            }
        }
    }
