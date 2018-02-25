import java.awt.*;
import java.awt.geom.*;

public class Circle implements Shape {

    private double xPoint;
    private double yPoint;
    private double diameter;
    private Color color;
    private boolean isFill;

    public Circle(double x, double y, double s, boolean b)
    {
        xPoint = x;
        yPoint = y;
        diameter = s;
        isFill = b;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        if(isFill){
            g2d.fill(new Ellipse2D.Double(xPoint, yPoint, diameter,diameter));
        }
        else{
            g2d.draw(new Ellipse2D.Double(xPoint,yPoint, diameter, diameter));
        }
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public void animate() {

    }

}

