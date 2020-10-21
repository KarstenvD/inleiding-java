package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Achtpunteen extends Applet {
    Button knop;
    String schermtext;
    String plek;
    int a;
    int b;
    public void init() {
        setSize(1920,150);
        schermtext = "deze :) staat op de verkeerde plek";
        a = 20;
        b = 20;
        knop = new Button("klik op mij om de :) op de goede plek neer te zetten");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
    }
        public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(935,75,50,50);
        g.setColor(Color.black);
            g.drawString(schermtext,a,b);
        }
        class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = 956;
            b = 104;
            schermtext = ":)";
            repaint();

        }


        }


}


