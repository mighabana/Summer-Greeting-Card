import java.awt.*;
import java.awt.geom.*;

public class Notification implements Shape
{
    private double xPoint;
    private double yPoint;

    public Notification(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d)
    {

        RoundRectangle2D.Double notifications = new RoundRectangle2D.Double(xPoint,yPoint,210,200,50,50);
        g2d.setColor(new Color(255,255,255));
        g2d.fill(notifications);

        RoundRectangle2D.Double button = new RoundRectangle2D.Double(xPoint + 58,yPoint + 167,100,30,20,20);
        g2d.setColor(new Color(250,0,0));
        g2d.draw(button);

        g2d.setFont(new Font("Nilland", Font.BOLD, 24));
        g2d.drawString("DONE",(int) xPoint + 75,(int) yPoint + 190);
        g2d.setColor(new Color(69,69,69));
        g2d.drawString("INSTRUCTIONS",(int) xPoint + 20,(int) yPoint + 25);
        
       

        g2d.setFont(new Font("Avenir", Font.PLAIN,14));
        g2d.drawString("- click the arrow to continue",(int) xPoint + 10,(int) yPoint + 50);
        g2d.drawString("- MOVING THE BOAT:",(int) xPoint + 10,(int) yPoint + 70);
        g2d.drawString("w - UP",(int) xPoint + 30,(int) yPoint + 90);
        g2d.drawString("s - DOWN",(int) xPoint + 30,(int) yPoint + 110);
        g2d.drawString("a - LEFT",(int) xPoint + 30,(int) yPoint + 130);
        g2d.drawString("d - RIGHT",(int) xPoint + 30,(int) yPoint + 150);
    }

    public void animate()
    {
        
    }
}