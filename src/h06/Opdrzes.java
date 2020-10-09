package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdrzes extends Applet {
    int a;
    int b;
    int uitkomst;
    public void init(){
        setSize(200,200);
        a = 133;
        b = 4;
        uitkomst = a / b;
    }
public void paint(Graphics g) {
        g.drawString("Karsten: $" + uitkomst,20,20);
    g.drawString("Jan: $" + uitkomst,20,40);
    g.drawString("Jean: $" + uitkomst,20,60);
    g.drawString("Peter: $" + uitkomst,20,80);
    g.drawString("Sorry dat het andere namen zijn",20,100);
}
}
