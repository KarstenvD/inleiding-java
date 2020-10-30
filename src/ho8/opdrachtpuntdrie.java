package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdrachtpuntdrie extends  Applet {
    Button ok;
    TextField textvak;
    Double getal, getal2, getal3, btw;
    public void init() {
        getal = 0.0;
        getal2 = 0.0;
        getal3 = 0.0;
        ok = new Button("ok");
        ok.addActionListener(new TextvakClass());
        textvak = new TextField("",20);
        textvak.addActionListener(new TextvakClass());
        add(textvak);
        add(ok);

    }
    public void paint(Graphics g){
        g.fillRect(100,50,165,50);
        g.fillRect(100,100,165,12);
        g.setColor(Color.white);
        g.drawString("Prijs zonder btw: $" + getal,105,65);
        g.drawString("Prijs met btw: $" + getal2,105,85);
        g.drawString("Verschil: $" + getal3,105,105);
    }
    class TextvakClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = textvak.getText();
            getal = Double.parseDouble(s);
            btw = 1.21;
            getal2 = getal*btw;
            getal2 *= 100;
            getal2 = (double)Math.round(getal2);
            getal2 /= 100;
            getal3 = getal2-getal;
            getal3 *= 100;
            getal3 = (double)Math.round(getal3);
            getal3 /= 100;
            repaint();

        }
    }
}
