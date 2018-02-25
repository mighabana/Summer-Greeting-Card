import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements Shape
{
    private double xPoint;
    private double yPoint;
    private double width;
    private double height;
    private boolean isFill;
    private Color color;
    
    public Rectangle(double x, int y, int w, int h, boolean b)
    {
        xPoint = x;
        yPoint = y;
        width = w;
        height = h;
        isFill = b;
        color = Color.BLACK;
    }
    
    public void draw(Graphics2D g2d)
    {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(xPoint,yPoint,width,height);
        g2d.setColor(color);
        if(isFill)
        {
            g2d.fill(rectangle);
        }
        else
        {
            g2d.draw(rectangle);
        }
    }
    
    public void setColor(Color c)
    {
        color = c;
    }
    
    public void animate()
    {
        
    }
}