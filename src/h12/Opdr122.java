package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdr122 extends Applet {
    Button[] knoppen;

    public void init() {
        knoppen = new Button[25];

        for (int teller = 0; teller < 25; teller++) {
            knoppen[teller] = new Button("+");
            add(knoppen[teller]);
        }
    }

    public void paint(Graphics g) {
    }
}

