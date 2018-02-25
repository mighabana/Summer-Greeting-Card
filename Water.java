import java.awt.*;
import java.awt.geom.*;
public class Water implements Shape
{
    private double xPoint;
    private double yPoint;
    private double width;
    private double height;
    public Water(double x, double y, double w, double h)
    {
        xPoint = x;
        yPoint = y;
        width = w;
        height = h;
    }

    public void draw(Graphics2D g2d)
    {
        Rectangle2D.Double sea = new Rectangle2D.Double(xPoint, yPoint, width, height);
        GradientPaint waves = new GradientPaint((int) xPoint,(int) yPoint, new Color(202,233,255),(int)xPoint, (int) (yPoint + height), new Color(2,138,181)) ;
        g2d.setPaint(waves);
        g2d.fill(sea);
    }
    
    public void animate()
    {
        
    }
}

