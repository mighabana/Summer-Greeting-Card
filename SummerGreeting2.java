import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.io.*;

public class SummerGreeting2 implements Shape {

    private double xPoint;
    private double yPoint;

    private boolean restart = false;

    private ArrayList<Square> confetti = new ArrayList<Square>();

    public SummerGreeting2(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) 
    {
        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(xPoint, yPoint , 250, 450, 10, 10);
        g2d.setColor(new Color(215,218,229));
        g2d.fill(screen);

        for(Square s : confetti)
        {
            s.draw(g2d);
        }

        Rectangle2D.Double back1 = new Rectangle2D.Double(xPoint + 70,yPoint + 90,100,30);
        g2d.setColor(new Color(215,218,229));
        g2d.fill(back1);
        Rectangle2D.Double back2 = new Rectangle2D.Double(xPoint + 105,yPoint + 160,30,30);
        g2d.fill(back2);
        Rectangle2D.Double back3 = new Rectangle2D.Double(xPoint + 62,yPoint + 230,120,30);
        g2d.fill(back3);
        Rectangle2D.Double back4 = new Rectangle2D.Double(xPoint + 50,yPoint + 295,150,35);
        g2d.fill(back4);
        Rectangle2D.Double back5 = new Rectangle2D.Double(xPoint + 90,yPoint + 345,65,15);
        g2d.fill(back5);

        g2d.setFont(new Font("Futura", Font.PLAIN, 38));
        g2d.setColor(new Color(69,69,69));
        g2d.drawString("HAVE",(int) xPoint + 70,(int) yPoint + 120);
        g2d.drawString("A",(int) xPoint + 105,(int) yPoint + 190);
        g2d.drawString("GREAT",(int) xPoint + 62,(int) yPoint + 260);

        g2d.setFont(new Font("Lighthouse Personal Use", Font.PLAIN, 50));
        g2d.setColor(new Color(245,133,63));
        g2d.drawString("Summer",(int) xPoint + 50,(int) yPoint + 330);

        g2d.setFont(new Font("Optima", Font.BOLD, 22));
        g2d.setColor(new Color(250,188,60));
        g2d.drawString("2 0 1 6",(int) xPoint + 90,(int) yPoint + 360);

    }

    public boolean getRestart()
    {
        return restart;
    }

    public void animate()
    {

        for(int x = 0; x < 2; x++)
        {
            int z = (int) (Math.random()*3 + 1);
            Square s = new Square((int) (Math.random()*185 + (xPoint + 30)), yPoint, 5,true);
            switch(z){
                case 1:

                s.setColor(Color.BLUE);
                confetti.add(s);
                break;

                case 2:
                s.setColor(Color.RED);
                confetti.add(s);
                break;

                case 3:
                s.setColor(Color.GREEN);
                confetti.add(s);
                break;
            }
        }

        for(Square s: confetti)
        {
            if(s.getY() > (yPoint + 440))
            {
                restart = true;
            }
        }

        for(Square s: confetti)
        {
            s.animate();
        }
    }
}