import java.awt.*;
import java.awt.geom.*;

public class LifeHouse implements Shape {

    private double xPoint;
    private double yPoint;
    private int timer;

    public LifeHouse(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) {

        Rectangle2D.Double lgHouse1 = new Rectangle2D.Double(xPoint,yPoint,70,60);
        g2d.setColor(new Color(187,151,101));
        g2d.fill(lgHouse1);

        Triangle lgHouseRoof1 = new Triangle(xPoint,yPoint,xPoint+70,yPoint-10,xPoint+70,yPoint,true);
        lgHouseRoof1.draw(g2d);
        double x = 0; 

        g2d.setColor(new Color(143,112,68));
        g2d.setStroke(new BasicStroke(5));

        for(int i = 0; i < 6; i++)
        {
            x += 18.8;

            Line line = new Line(xPoint - 30.8 + x, yPoint + 60, xPoint - 30.8 + x, yPoint + 40);
            line.draw(g2d);
        }

        Line lgHouseRails3 = new Line(xPoint - 15, yPoint + 40, xPoint + 85,yPoint +40);
        lgHouseRails3.draw(g2d);

        Line lgHouse2 = new Line(xPoint - 15,yPoint +60,xPoint +85,yPoint +60);
        g2d.setColor(new Color(187,151,101));
        g2d.setStroke(new BasicStroke(5));
        lgHouse2.draw(g2d);

        Line flag1 = new Line(xPoint +10,yPoint -3,xPoint +10,yPoint - 40);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(new Color(245,216,99));
        flag1.draw(g2d);

        Rectangle2D.Double flag2 = new Rectangle2D.Double(xPoint - 10,yPoint - 12 - timer,19,10);
        g2d.setColor(new Color(198,73,54));
        g2d.fill(flag2);

        Line lgHouseRoof2 = new Line (xPoint - 5,yPoint,xPoint +75,yPoint - 10);
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(new Color(104,80,46));
        lgHouseRoof2.draw(g2d);

        double y = 0;
        g2d.setColor(new Color(134,99,62));
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i < 6; i ++)
        {
            y +=10;

            Line lgHouseDetails = new Line(xPoint ,yPoint -10 + y,xPoint +69,yPoint -10 + y);
            lgHouseDetails.draw(g2d);
        }

        Rectangle2D.Double window1 = new Rectangle2D.Double(xPoint +33,yPoint + 5,25,20);
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(new Color(104,80,46));
        g2d.draw(window1);

        Rectangle2D.Double window2 = new Rectangle2D.Double(xPoint + 34.5,yPoint + 6.5,23,18);
        g2d.setColor(new Color(255,243,178));
        g2d.fill(window2);

        Rectangle2D.Double window3 = new Rectangle2D.Double(xPoint + 34.5,yPoint + 6.5,23,2.5);
        GradientPaint waves = new GradientPaint(200,370,new Color(202,233,255),200,480,new Color(2,138,181));
        g2d.setPaint(waves);
        g2d.fill(window3);

        Circle lifeSaver2 = new Circle(xPoint + 7,yPoint + 20,15,false);
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.RED);
        lifeSaver2.draw(g2d);

        float dash2[] = {6.0f};
        Circle lifeSaver1 = new Circle(xPoint + 7,yPoint + 20,15,false); 
        g2d.setStroke(new BasicStroke(5,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f,dash2,5.0f));
        g2d.setColor(Color.WHITE);
        lifeSaver1.draw(g2d);

        Line lgHouseBase1 = new Line(xPoint +75,yPoint + 65,xPoint - 5,yPoint + 89);
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(new Color(187,151,101));
        lgHouseBase1.draw(g2d);

        Line2D.Double lgHouseBase2 = new Line2D.Double(xPoint - 5,yPoint + 65,xPoint +75,yPoint + 89);
        g2d.draw(lgHouseBase2);

        Line2D.Double lgHouseLeg1 = new Line2D.Double(xPoint - 5,yPoint + 62,xPoint - 5,yPoint + 92); 
        g2d.setStroke(new BasicStroke(7));
        g2d.draw(lgHouseLeg1);

        Line2D.Double lgHouseLeg2 = new Line2D.Double(xPoint +75,yPoint + 62,xPoint +75,yPoint + 92);
        g2d.draw(lgHouseLeg2);
        
        g2d.setStroke(new BasicStroke(1));
    }

    public void animate() 
    {
        timer++;
               
        if(timer > 28)
        {
            timer = 28;
        }

    }

}
