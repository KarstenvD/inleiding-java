package h05;

import java.applet.Applet;
import java.awt.*;

public class Hf4opnieuw extends Applet {
    Color opvulkleur;
    Color lijnkleur;


    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.BLACK;
        setSize(1000,500);
    }
    public void paint(Graphics g) {
        // Lijn
        g.drawLine(10, 10, 200, 10);
        g.drawString("lijn", 96, 35);
        // Rechthoek
        g.drawRect(10, 50, 190, 100);
        g.drawString("Rechthoek", 80, 175);
        // Roze ovaal gebeuren
        g.setColor(opvulkleur);
        g.fillRect(230, 50, 190, 100);
        g.setColor(lijnkleur);
        g.drawOval(230, 50, 190, 100);
        g.setColor(lijnkleur);
        g.drawString("roze ovaal rechthoek gebeuren", 245, 175);
        // Taartpunt ovaal
        g.drawOval(450, 50, 190, 100);
        g.setColor(opvulkleur);
        g.fillArc(450, 50, 190, 100, 0, 60);
        g.setColor(lijnkleur);
        g.drawString("Ovaal met taartpunt", 485, 175);
        //Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(10, 220, 190, 100, 50, 50);
        g.drawString("afgeronde rechthoek", 45, 345);
        // Gevulde ovaal
        g.drawOval(230, 220, 190, 100);
        g.setColor(opvulkleur);
        g.fillOval(230, 220, 190, 100);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 275, 345);
        // Cirkel
        g.drawOval(450, 220, 190, 190);
        g.drawString("cirkel", 520, 440);
    }
    }
