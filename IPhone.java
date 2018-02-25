import java.awt.*;
import java.awt.geom.*;

public class IPhone implements Shape {

    private double xPoint;
    private double yPoint;

    public IPhone(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) {

        RoundRectangle2D.Double lockButton = new RoundRectangle2D.Double(xPoint + 225,yPoint - 4,40,10, 5,5);
        g2d.setColor(new Color(212,175,55));
        g2d.fill(lockButton);

        RoundRectangle2D.Double silent = new RoundRectangle2D.Double(xPoint - 4,yPoint + 75,10,30,5,5);
        g2d.fill(silent);

        RoundRectangle2D.Double volUP = new RoundRectangle2D.Double(xPoint -5, yPoint + 125, 10, 20, 10,10);
        g2d.fill(volUP);

        RoundRectangle2D.Double volDOWN = new RoundRectangle2D.Double(xPoint - 5,yPoint  + 165,10,20,10,10);
        g2d.fill(volDOWN);

        RoundRectangle2D.Double casing = new RoundRectangle2D.Double(xPoint  - 2,yPoint  - 2,304,604,50,50);
        g2d.fill(casing);

        Rectangle2D.Double topBar = new Rectangle2D.Double(xPoint  - 2,yPoint + 50,304,10);
        Rectangle2D.Double bottomBar = new Rectangle2D.Double(xPoint  - 2,yPoint + 545,304,10);
        g2d.setColor(Color.WHITE);
        g2d.fill(topBar);
        g2d.fill(bottomBar);

        RoundRectangle2D.Double phone = new RoundRectangle2D.Double(xPoint,yPoint,300,600,50,50);
        g2d.setColor(Color.WHITE);
        g2d.fill(phone);

        Circle camera = new Circle(xPoint + 145,yPoint + 25, 10, true);
        g2d.setColor(Color.BLACK);
        camera.draw(g2d);

        RoundRectangle2D.Double speaker = new RoundRectangle2D.Double(xPoint + 130,yPoint + 50,40,5,5,5);
        g2d.fill(speaker);

        Circle oCircle = new Circle(xPoint + 120, yPoint + 50, 5, true);
        oCircle.draw(g2d);

        Circle hButton1 = new Circle(xPoint + 125,yPoint + 540,50,true);
        g2d.setColor(new Color(212,175,55));
        hButton1.draw(g2d);

        Circle hButton2 = new Circle(xPoint + 128,yPoint + 543,44, true);
        g2d.setColor(Color.WHITE);  
        hButton2.draw(g2d);

        RoundRectangle2D.Double bScreen = new RoundRectangle2D.Double(xPoint + 23,yPoint + 73,254,454,10,10);
        g2d.setColor(Color.BLACK);
        g2d.fill(bScreen);
    }
    
    public void animate(){
        
    }
}