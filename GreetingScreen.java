import java.awt.*;
import java.awt.geom.*;

public class GreetingScreen implements Shape {

    private double xPoint;
    private double yPoint;

    public GreetingScreen(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) 
    {
      
        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(xPoint, yPoint, 250, 450, 10, 10);
        g2d.setColor(new Color(215,218,229));
        g2d.fill(screen);

        Rectangle2D.Double top = new Rectangle2D.Double(xPoint,yPoint,250,50);
        g2d.setColor(new Color(126,162,170));
        g2d.fill(top);

        g2d.setFont(new Font("Futura", Font.PLAIN,30));
        g2d.setColor(Color.WHITE);
        g2d.drawString("MENU",(int) xPoint + 75,(int) yPoint + 35);

        Rectangle2D.Double app = new Rectangle2D.Double(xPoint + 20,yPoint + 100,80,50);
        g2d.fill(app);

        Rectangle2D.Double bg = new Rectangle2D.Double(xPoint + 25,yPoint + 105,70,40);
        GradientPaint sky = new GradientPaint((int) xPoint + 20,(int) yPoint + 105,new Color(99,172,193),(int) xPoint + 20,(int) 315,new Color(255,158,0));
        g2d.setPaint(sky);
        g2d.fill(bg);

        Arc2D.Double sun = new Arc2D.Double(xPoint + 40,yPoint + 120,50,50,0,180,Arc2D.OPEN);
        g2d.setColor(Color.ORANGE);
        g2d.fill(sun);

        g2d.setFont(new Font("Futura", Font.PLAIN,12));
        g2d.setColor(new Color(69,69,69));
        g2d.drawString("SUMMER",(int) xPoint + 32,(int) yPoint + 170);

        g2d.setFont(new Font("Lucida Blackletter", Font.PLAIN,24));
        g2d.setColor(new Color(69,69,69));
        g2d.drawString("G",(int) xPoint + 50,(int) yPoint + 420);

        g2d.drawString("C",(int) xPoint + 150,(int) yPoint + 420);

        g2d.setFont(new Font("PilGi", Font.PLAIN, 18));
        g2d.drawString("reeting",(int) xPoint + 70,(int) yPoint + 415);

        g2d.drawString("ard",(int) xPoint + 170,(int) yPoint + 415);

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

    public void animate(){

    }
}
