import java.awt.*;
import java.awt.geom.*;

public class Bird implements Shape
{
    private double xPoint;
    private double yPoint;
    private Color color;
    private boolean fade;
    private int timer;

    public Bird(double x, double y)
    {
        xPoint = x;
        yPoint = y;
        color = Color.BLACK;
        fade = false;
    }

    public void draw(Graphics2D g2d)
    {
        Path2D.Double bird1 = new Path2D.Double();
        bird1.moveTo(xPoint,yPoint);
        bird1.curveTo(xPoint + 10,yPoint + 2,xPoint + 13,yPoint + 5,xPoint + 15,yPoint + 8); bird1.curveTo(xPoint + 17,yPoint + 5,xPoint + 20,yPoint + 2,xPoint + 30,yPoint);
        g2d.setStroke(new BasicStroke(1)); 
        g2d.setColor(color);
        g2d.draw(bird1);
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public void setFade()
    {
        fade = true;
    }
    
    public double getX()
    {
        return xPoint;
    }

    public void animate()
    {
        xPoint++;
        yPoint--;

        if(fade)
        {
            timer++;
            if(timer >= 15)
            {
                timer = 15;
            }
            this.setColor(new Color(0,0,0,255 - (timer*17)));
        }
    }
}
