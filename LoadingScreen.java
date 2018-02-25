import java.awt.*;
import java.awt.geom.*;

public class LoadingScreen implements Shape {

    private double xPoint;
    private double yPoint;

    private Circle load1;
    private Circle load2;
    private Circle load3;
    private Circle load4;
    private Circle load5;
    private Circle load6;

    private int timer = 1;

    public LoadingScreen(double x, double y)
    {
        xPoint = x;
        yPoint = y;

        load1 = new Circle(xPoint + 120,yPoint + 250,10,true);
        load2 = new Circle(xPoint + 132,yPoint + 258,10,true);
        load3 = new Circle(xPoint + 132,yPoint + 272,10,true);
        load4 = new Circle(xPoint + 120,yPoint + 280,10,true);
        load5 = new Circle(xPoint + 108,yPoint + 272,10,true);
        load6 = new Circle(xPoint + 108,yPoint + 258,10,true);
    }

    public void draw(Graphics2D g2d) 
    {

        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(xPoint, yPoint, 250, 450, 10, 10);
        g2d.setColor(new Color(215,218,229));
        g2d.fill(screen);

        Ellipse2D.Double base1 = new Ellipse2D.Double(xPoint + 80,yPoint + 100,100,80);
        g2d.setColor(new Color(8,61,119));
        g2d.fill(base1);

        Circle base2 = new Circle(xPoint + 100,yPoint + 60,60,true);
        g2d.setColor(new Color(215,218,229));
        base2.draw(g2d);

        Circle base3 = new Circle(xPoint + 100,yPoint + 160,60,true);
        base3.draw(g2d);

        Path2D.Double logo1 = new Path2D.Double();
        logo1.moveTo(xPoint + 100,yPoint + 110);
        logo1.curveTo(xPoint + 140,yPoint + 135,xPoint + 160,yPoint + 110,xPoint + 160,yPoint + 110);
        logo1.lineTo(xPoint + 150,yPoint + 135);
        logo1.curveTo(xPoint + 130,yPoint + 140,xPoint + 115,yPoint + 130,xPoint + 100,yPoint + 110);
        g2d.setColor(new Color(242,27,63));
        g2d.fill(logo1);

        Path2D.Double logo2 = new Path2D.Double();
        logo2.moveTo(xPoint + 110,yPoint + 130);
        logo2.curveTo(xPoint + 115,yPoint + 130,xPoint + 125,yPoint + 150,xPoint + 150,yPoint + 140);
        logo2.lineTo(xPoint + 135,yPoint + 170);
        logo2.lineTo(xPoint + 110,yPoint + 130);
        g2d.setColor(new Color(232,197,71));
        g2d.fill(logo2);

        load1.draw(g2d);

        load2.draw(g2d);

        load3.draw(g2d);

        load4.draw(g2d);

        load5.draw(g2d);

        load6.draw(g2d);

        g2d.setFont(new Font("Lucida Blackletter", Font.PLAIN,38));
        g2d.setColor(new Color(69,69,69));
        g2d.drawString("G",(int) xPoint + 30,(int) yPoint + 240);

        g2d.drawString("C",(int) xPoint + 150,(int) yPoint + 240);

        g2d.setFont(new Font("PilGi", Font.PLAIN, 30));
        g2d.drawString("reeting",(int) xPoint + 60,(int) yPoint + 235);

        g2d.drawString("ard",(int)xPoint + 180,(int) yPoint + 235);

        Rectangle2D.Double d1 = new Rectangle2D.Double(xPoint,yPoint + 430,62.5,20);
        g2d.setColor(new Color(8,189,189));
        g2d.fill(d1);

        Rectangle2D.Double d2 = new Rectangle2D.Double(xPoint + 62.5,yPoint + 430,62.5,20);
        g2d.setColor(new Color(242,27,63));
        g2d.fill(d2);

        Rectangle2D.Double d3 = new Rectangle2D.Double(xPoint + 125,yPoint + 430,62.5,20);
        g2d.setColor(new Color(8,61,119));
        g2d.fill(d3);

        Rectangle2D.Double d4 = new Rectangle2D.Double(xPoint + 187.5,yPoint + 430,62.5,20);
        g2d.setColor(new Color(232,197,71));
        g2d.fill(d4);
    }

    public void animate()
    {

        Color a = new Color(0,0,0,255);
        Color b = new Color(0,0,0,220);
        Color c = new Color(0,0,0,185);
        Color d = new Color(0,0,0,150);
        Color e = new Color(0,0,0,115);
        Color f = new Color(0,0,0,80);

        switch (timer){

            case 1:
            load1.setColor(a);
            load2.setColor(b);
            load3.setColor(c);
            load4.setColor(d);
            load5.setColor(e);
            load6.setColor(f);
            timer++;
            break;
            case 2:
            load1.setColor(f);
            load2.setColor(a);
            load3.setColor(b);
            load4.setColor(c);
            load5.setColor(d);
            load6.setColor(e);
            timer++;
            break;
            case 3:
            load1.setColor(e);
            load2.setColor(f);
            load3.setColor(a);
            load4.setColor(b);
            load5.setColor(c);
            load6.setColor(d);
            timer++;
            break;
            case 4:
            load1.setColor(d);
            load2.setColor(e);
            load3.setColor(f);
            load4.setColor(a);
            load5.setColor(b);
            load6.setColor(c);
            timer++;
            break;
            case 5:
            load1.setColor(c);
            load2.setColor(d);
            load3.setColor(e);
            load4.setColor(f);
            load5.setColor(a);
            load6.setColor(b);
            timer++;
            break;
            case 6:
            load1.setColor(b);
            load2.setColor(c);
            load3.setColor(d);
            load4.setColor(e);
            load5.setColor(f);
            load6.setColor(a);
            timer = 1;
            break;

        }
    }
}