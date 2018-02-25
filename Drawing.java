import java.awt.*;
import java.awt.geom.*;

public class Drawing implements Shape
{
    private double xPoint;
    private double yPoint;
    private Bird bird1;
    private Bird bird2;
    private SwimmingPerson sp;
    private LifeHouse lh;
    private Boat boat;
    private Triangle t;


    public Drawing(double x, double y)
    {
        xPoint = x;
        yPoint = y;
        bird1 = new Bird(275,332);  
        bird2 = new Bird(295,312);
        sp = new SwimmingPerson(xPoint + 200,yPoint + yPoint + 130);
        lh = new LifeHouse(xPoint +40,yPoint + 320);
        boat = new Boat(xPoint + 150,yPoint + 230);
        boat.setBounds(xPoint,yPoint + 300,xPoint + 170,yPoint + 330);
        t = new Triangle(xPoint + 195,yPoint + 20,xPoint + 225,180,xPoint + 195,yPoint + 40,true);
    }

    public void draw(Graphics2D g2d)
    {
        Sky sky = new Sky(xPoint,yPoint,250,450);
        sky.draw(g2d);

        RoundRectangle2D.Double sand = new RoundRectangle2D.Double(xPoint,yPoint + 320,250,130,10,10);
        g2d.setColor(new Color(255,243,178));
        g2d.fill(sand);

        Circle sun = new Circle((xPoint + 33) ,yPoint + 190,65,true);
        sun.setColor(new Color(255,158,0));
        sun.draw(g2d);

        Water sea = new Water(xPoint,yPoint + 220,250,110);
        sea.draw(g2d);

        int green = 246;
        int blue = 232;
        int f = 75;
        double x = 0;
        double y = 0;

        for(int i = 0; i < 6; i++)
        {
            green -= 9;
            blue -= 23;
            f -= 10;
            x += 4;
            y += 5;

            g2d.setColor(new Color(255,green,blue));
            g2d.fill(new Arc2D.Double((xPoint + 28) + x,(yPoint + 182) + y,f,f,180,180,Arc2D.OPEN));
        }

        sp.draw(g2d);
        
        boat.draw(g2d);
        
        bird1.draw(g2d);
        
        bird2.draw(g2d);
        
        g2d.setColor(new Color(240,0,0));
        t.draw(g2d);

        lh.draw(g2d);
    }
    
    public Boat getBoat()
    {
        return boat;
    }

    public void animate()
    {
        if(bird1.getX() + 30 < 375)
            bird1.animate();
        else if((bird1.getX() +30) == 375)
        {
            bird1.setFade();
            bird1.animate();
        }
        else if((bird1.getX() + 30) < 400)
            bird1.animate();

        if(bird2.getX() + 30 < 375)
            bird2.animate();
        else if((bird2.getX() +30) == 375)
        {
            bird2.setFade();
            bird2.animate();
        }
        else if((bird2.getX() + 30) < 400)
            bird2.animate();

        if(sp.getX() + 23 > 430)
        {
            sp.setDirection();
        }
        else if(sp.getX() <220)
        {
            sp.setDirection();
        }

        t.animate();

        sp.animate();
        
        boat.animate();

        lh.animate();

    }

}
