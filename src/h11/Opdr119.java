package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr119 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
       for(int kolom = 1; kolom < 8; kolom++) {
           for(int rij = 1; rij < 8; rij++) {
               if((kolom + rij) % 2 == 1) {
                   g.setColor(Color.black);
                   g.fillRect(50 + kolom*20,50 + rij*20,20,20);
               }
               else {
                   g.setColor(Color.white);
                   g.fillRect(50 + kolom*20,50 + rij*20,20,20);
               }

           }
       }
    }
}
