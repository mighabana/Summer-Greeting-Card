import java.awt.*;
import java.awt.geom.*;
public class Sky implements Shape
{
    private double xPoint;
    private double yPoint;
    private double width;
    private double height;

    public Sky(double x, double y, double w, double h)
    {
        xPoint = x;
        yPoint = y;
        width = w;
        height = h;
    }

    public void draw(Graphics2D g2d)
    {
        RoundRectangle2D.Double sky = new RoundRectangle2D.Double(xPoint, yPoint, width, height,10, 10);
        GradientPaint skyPaint = new GradientPaint((int) xPoint,(int) yPoint, new Color(99,172,193),(int)xPoint, (int) (yPoint + height-30), new Color(255,158,0)) ;
        g2d.setPaint(skyPaint);
        g2d.fill(sky);
    }
    
    public void animate()
    {
        
    }
}
