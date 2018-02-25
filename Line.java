import java.awt.*;
import java.awt.geom.*;

public class Line implements Shape {

    private double xPoint1;
    private double yPoint1;
    private double xPoint2;
    private double yPoint2;
    private Color color;

    public Line(double x1, double y1, double x2, double y2)
    {
        xPoint1 = x1;
        yPoint1 = y1;
        xPoint2 = x2;
        yPoint2 = y2;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.draw(new Line2D.Double(xPoint1, yPoint1, xPoint2, yPoint2));
    }
    
    public void setColor(Color c)
    {
        color = c;
    }

    public void animate() {

    }

}
