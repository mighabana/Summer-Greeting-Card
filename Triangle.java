import java.awt.*;
import java.awt.geom.*;

public class Triangle implements Shape {

    private double xPoint1;
    private double yPoint1;
    private double xPoint2;
    private double yPoint2;
    private double xPoint3;
    private double yPoint3;
    private Color color;
    private boolean isFill;
    private boolean isBig;
    private double timer;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, boolean b)
    {
        xPoint1 = x1;
        yPoint1 = y1;
        xPoint2 = x2;
        yPoint2 = y2;
        xPoint3 = x3;
        yPoint3 = y3;
        isFill = b;
        timer = 0;

    }

    public void draw(Graphics2D g2d) 
    {          

        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(xPoint1,yPoint1);
        triangle.lineTo(xPoint2,yPoint2); triangle.lineTo(xPoint3,yPoint3); triangle.lineTo(xPoint1,yPoint1);
        g2d.setColor(color);

        if(isFill){
            g2d.fill(triangle);
        }
        else{
            g2d.draw(triangle);
        }

    }

    public void setColor(Color c)
    {
        color = c;
    }

    public void animate() {
        double rate = 0.1 * Math.sin(timer);
        timer += 0.2;
        if(isBig)
        {
            xPoint1 -= rate;
            yPoint1 -= rate;
            xPoint2 += rate;
            xPoint3 -= rate;
            yPoint3 += rate;
            if(timer > 360)
            {
                timer = 0;
                isBig = false;
            }
        }
        else
        {
            xPoint1 += rate;
            yPoint1 += rate;
            xPoint2 -= rate;
            xPoint3 += rate;
            yPoint3 -= rate;
            if(timer > 360)
            {
                timer = 0;
                isBig = true;
            }
        }

    }
}
