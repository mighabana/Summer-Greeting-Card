import java.awt.*;
import java.awt.geom.*;

public class SwimmingPerson implements Shape
{
    private double xPoint;
    private double yPoint;
    private boolean isSwimmingRight;
    private double timer;

    public SwimmingPerson(double x, double y)
    {
        xPoint = x;
        yPoint = y;
        isSwimmingRight = true;
        timer = 0;
        
    }

    public void draw(Graphics2D g2d)
    {
        double y1 = 2 * Math.sin(timer) + 3;

        Circle personHead = new Circle(xPoint,yPoint + y1,10,true);
        personHead.setColor(new Color(252,200,172));
        personHead.draw(g2d);

        RoundRectangle2D.Double personArm1 = new RoundRectangle2D.Double(xPoint - 3,yPoint - 4 + y1,5,14,10,5);
        g2d.fill(personArm1);

        RoundRectangle2D.Double personArm2 = new RoundRectangle2D.Double(xPoint + 10,yPoint - 3 + y1,5,13,10,5);
        g2d.fill(personArm2);

        Circle personEye1 = new Circle(xPoint + 3,yPoint + 3 +y1,1,true);
        g2d.setColor(Color.BLACK);
        personEye1.draw(g2d);

        Circle personEye2 = new Circle(xPoint + 7,yPoint + 3 +y1,1,true);
        personEye2.draw(g2d);

        Circle personMouth = new Circle(xPoint + 4,yPoint + 5 +y1,3,true);
        personMouth.draw(g2d);

        Path2D.Double wave1 = new Path2D.Double();
        wave1.moveTo(xPoint -10,yPoint + 13);
        wave1.curveTo(xPoint -5,yPoint + 12,xPoint -4,yPoint + 9,xPoint -2,yPoint + 7); wave1.curveTo(xPoint,yPoint + 9,xPoint + 1,yPoint + 12,xPoint + 6,yPoint + 13);
        wave1.curveTo(xPoint + 11,yPoint + 12,xPoint + 12,yPoint + 9,xPoint + 14,yPoint + 7); wave1.curveTo(xPoint + 16,yPoint + 9,xPoint + 17,yPoint + 12,xPoint + 22,yPoint + 13);
        g2d.draw(wave1);

        Path2D.Double waveFill1 = new Path2D.Double();
        waveFill1.moveTo(xPoint - 9,yPoint + 15);
        waveFill1.curveTo(xPoint -4,yPoint + 14,xPoint - 3,yPoint + 11,xPoint - 1,yPoint + 9); waveFill1.curveTo(xPoint + 1,yPoint + 11,xPoint + 2,yPoint + 14,xPoint + 7,yPoint + 15);
        waveFill1.curveTo(xPoint + 12,yPoint + 14,xPoint + 13,yPoint + 11,xPoint + 15,yPoint + 9); waveFill1.curveTo(xPoint + 17,yPoint + 11,xPoint + 18,yPoint + 14,xPoint + 23,yPoint + 15);
        GradientPaint waves = new GradientPaint(200,370,new Color(202,233,255),200,480,new Color(2,138,181));
        g2d.setPaint(waves);
        g2d.fill(waveFill1);
    }
    
    public void setDirection()
    {
        if(isSwimmingRight)
        {
            isSwimmingRight = false;
        }
        else
        {
            isSwimmingRight = true;
        }
    }
    
    public double getX()
    {
        return xPoint;
    }

    public void animate()
    {
        timer += 0.15;
        if(timer > 360)
        {
            timer = 0;
        }

        if(isSwimmingRight)
        {
            xPoint++;
        }
        else
        {
            xPoint--;
        }

    }
}
