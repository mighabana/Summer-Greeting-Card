import java.awt.*;
import java.awt.geom.*;

public class Square implements Shape {

    private double xPoint;
    private double yPoint;
    private double side;
    private Color color;
    private boolean isFill;

    private boolean isRight;
    private double timer;

    public Square(double x, double y, double s, boolean b)
    {
        xPoint = x;
        yPoint = y;
        side = s;
        isFill = b;
        int z = (int) (Math.random()*2 +1);
        if(z == 1)

            isRight = true;
        else
            isRight = false;

    }

    public void draw(Graphics2D g2d) {   
        g2d.setColor(color);
        if(isFill){
            g2d.fill(new Rectangle2D.Double(xPoint, yPoint, side,side));
        }
        else{
            g2d.draw(new Rectangle2D.Double(xPoint,yPoint, side, side));
        }
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public double getX()
    {
        return xPoint;
    }

    public double getY()
    {
        return yPoint;
    }

    public void moveXY(double x, double y)
    {
        xPoint += x;
        yPoint += y;
    }

    public void animate() {
        double rate = 0.1*Math.sin(timer) + 3;
        timer += 40;
        
        if(isRight)
        {
            this.moveXY(rate,rate);
            if(timer > 360){
                timer = 0;
                isRight = false;
            }
        }
        else
        {
            this.moveXY(-rate,rate);
            if(timer > 360){
                timer = 0;
                isRight = true;
            }
        }
    }

}
