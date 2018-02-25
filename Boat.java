import java.awt.*;
import java.awt.geom.*;

public class Boat implements Shape {

    private double xPoint;
    private double yPoint;

    private boolean isUP;
    private boolean isDOWN;
    private boolean isLEFT;
    private boolean isRIGHT;
    
    private double timer;
    
    private double xMin;
    private double xMax;
    private double yMin;
    private double yMax;

    public Boat(double x, double y)
    {
        xPoint = x;
        yPoint = y;
        
        isUP = false;
        isDOWN = false;
        isLEFT = false;
        isRIGHT = false;  
        timer = 0;
    }

    public void draw(Graphics2D g2d) {

        double y1 = 1.5 * Math.sin(timer) + 2.5;

        Path2D.Double boatBase = new Path2D.Double();
        boatBase.moveTo(xPoint,yPoint + y1);
        boatBase.lineTo(xPoint +3,yPoint + 5 +y1); boatBase.lineTo(xPoint + 33,yPoint + 5 +y1);
        boatBase.lineTo(xPoint + 40,yPoint - 4 +y1); boatBase.lineTo(xPoint,yPoint +y1);
        g2d.setColor(new Color(143,112,68));
        g2d.fill(boatBase);

        Line2D.Double boatPost = new Line2D.Double(xPoint  +15,yPoint +y1,xPoint  +10,yPoint - 30 +y1);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(boatPost);

        Path2D.Double boatMast1 = new Path2D.Double();
        boatMast1.moveTo(xPoint + 12,yPoint - 30 +y1);
        boatMast1.curveTo(xPoint + 22,yPoint -20 +y1,xPoint + 31,yPoint  -15 +y1,xPoint + 35,yPoint -5 +y1); boatMast1.lineTo(xPoint +16,yPoint - 3 +y1);
        boatMast1.curveTo(xPoint +18,yPoint - 17 +y1,xPoint + 19,yPoint - 22 +y1,xPoint +12,yPoint - 30 +y1);
        GradientPaint mast1Color = new GradientPaint((int)xPoint -12,(int) (yPoint - 30 +y1), Color.WHITE, (int) xPoint + 35,(int) (yPoint -5 +y1),new Color(255,78,80));
        g2d.setPaint(mast1Color);  
        g2d.fill(boatMast1);

        Path2D.Double boatMast2 = new Path2D.Double();
        boatMast2.moveTo(xPoint  +10,yPoint - 30 +y1);
        boatMast2.curveTo(xPoint +3,yPoint -20 +y1,xPoint - 2,yPoint - 10 +y1,xPoint +3,yPoint - 2 +y1); boatMast2.lineTo(xPoint + 14,yPoint - 3 +y1);
        boatMast2.curveTo(xPoint +9,yPoint - 10 +y1,xPoint + 8,yPoint - 17 +y1,xPoint  +10,yPoint - 30 +y1);
        GradientPaint mast2Color = new GradientPaint((int) xPoint  +10,(int) (yPoint - 30 +y1), Color.WHITE,(int) xPoint +3,(int) (yPoint - 2 +y1),new Color(255,78,80));
        g2d.setPaint(mast2Color);
        g2d.fill(boatMast2);

        Path2D.Double wave2 = new Path2D.Double();
        wave2.moveTo(xPoint - 5,yPoint + 7);
        wave2.curveTo(xPoint,yPoint + 6,xPoint + 1,yPoint + 3,xPoint +3,yPoint + 1); wave2.curveTo(xPoint + 5,yPoint + 3,xPoint + 6,yPoint + 6,xPoint + 11,yPoint + 7);
        wave2.curveTo(xPoint +16,yPoint + 6,xPoint + 17,yPoint + 3,xPoint + 19,yPoint + 1); wave2.curveTo(xPoint + 21,yPoint + 3,xPoint + 22,yPoint + 6,xPoint + 22,yPoint + 7);
        wave2.curveTo(xPoint + 32,yPoint + 6,xPoint + 33,yPoint + 3,xPoint + 35,yPoint + 1); wave2.curveTo(xPoint + 37,yPoint + 3,xPoint + 38,yPoint + 6,xPoint + 43,yPoint + 7);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(1));
        g2d.draw(wave2);

        Path2D.Double waveFill2 = new Path2D.Double();
        waveFill2.moveTo(xPoint - 4,yPoint + 9);
        waveFill2.curveTo(xPoint + 1,yPoint + 8,xPoint + 2,yPoint + 5,xPoint + 4,yPoint + 3); waveFill2.curveTo(xPoint + 6,yPoint + 5,xPoint + 7,yPoint + 8,xPoint + 12,yPoint + 9);
        waveFill2.curveTo(xPoint + 17,yPoint + 8,xPoint +18,yPoint + 5,xPoint + 20,yPoint + 3); waveFill2.curveTo(xPoint + 22,yPoint + 5,xPoint + 23,yPoint + 8,xPoint + 28,yPoint + 9);
        waveFill2.curveTo(xPoint + 33,yPoint + 8,xPoint + 34,yPoint + 5,xPoint + 36,yPoint + 3); waveFill2.curveTo(xPoint + 38,yPoint + 5,xPoint + 39,yPoint + 8,xPoint + 44,yPoint + 9);
        GradientPaint waves = new GradientPaint(200,370,new Color(202,233,255),200,480,new Color(2,138,181));
        g2d.setPaint(waves);
        g2d.fill(waveFill2);

    }

    public void setUP()
    {
        isUP = true;
    }

    public void setDOWN()
    {
        isDOWN = true;
    }

    public void setLEFT()
    {
        isLEFT = true;
    }

    public void setRIGHT()
    {
        isRIGHT = true;
    }
    
    public void restart()
    {
        isUP = false;
        isDOWN = false;
        isLEFT = false;
        isRIGHT = false;
    }
    
    public double getX()
    {
        return xPoint;
    }
    
    public double getY()
    {
        return yPoint;
    }
    
    public void setBounds(double x1,double x2, double y1,double y2)
    {
        xMin = x1;
        xMax = x2;
        yMin = y1;
        yMax = y2;
    }

    public void animate()
    {
        timer += 0.15;
        if(timer > 360)
        {
            timer = 0;
        }

        if(isUP)
        {
            if(yPoint + 1 > yMin)
            yPoint--;
            //isUP = false;
        }
        else if(isDOWN)
        {
            if(yPoint + 9 < yMax)
            yPoint++;
            //isDOWN = false;
        }
        else if(isLEFT)
        {
            if(xPoint > xMin)
            xPoint--;
            //isLEFT = false;
        }
        else if(isRIGHT)
        {
            if(xPoint + 44 < xMax)
            xPoint++;
            //isRIGHT = false;
        }

    }
}