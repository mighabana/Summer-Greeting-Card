import java.awt.*;
import java.awt.geom.*;

public class HomeScreen implements Shape {

    private double xPoint;
    private double yPoint;

    public HomeScreen(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) {

        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(xPoint,yPoint,250, 450,10,10);
        g2d.setColor(new Color(31,54,61));  
        g2d.fill(screen);

        Path2D.Double mountain1 = new Path2D.Double();
        mountain1.moveTo(xPoint,yPoint + 280);
        mountain1.lineTo(xPoint + 20,yPoint + 270); mountain1.lineTo(xPoint + 40,yPoint + 265); mountain1.lineTo(xPoint + 50,yPoint + 260); 
        mountain1.lineTo(xPoint + 60,yPoint + 250); mountain1.lineTo(xPoint + 70,yPoint + 245); mountain1.lineTo(xPoint + 80,yPoint + 240);
        mountain1.lineTo(xPoint + 85,yPoint + 235); mountain1.lineTo(xPoint + 100,yPoint + 250); mountain1.lineTo(xPoint + 140,yPoint + 260);
        mountain1.lineTo(xPoint + 150,yPoint + 265); mountain1.lineTo(xPoint + 160,yPoint + 280); mountain1.lineTo(xPoint + 185,yPoint + 250);
        mountain1.lineTo(xPoint + 200,yPoint + 240);mountain1.lineTo(xPoint + 210,yPoint + 230); mountain1.lineTo(xPoint + 220,yPoint + 235);
        mountain1.lineTo(xPoint + 240,yPoint + 260); mountain1.lineTo(xPoint + 250,yPoint + 280);
        g2d.setColor(new Color(219,90,66));
        g2d.fill(mountain1);

        Rectangle2D.Double block1 = new Rectangle2D.Double(xPoint,yPoint + 280,250,50);
        g2d.fill(block1);

        Path2D.Double mountain2 = new Path2D.Double();
        mountain2.moveTo(xPoint,yPoint + 310);
        mountain2.lineTo(xPoint + 10,yPoint + 295); mountain2.lineTo(xPoint + 30,yPoint + 285); mountain2.lineTo(xPoint + 45,yPoint + 275);
        mountain2.lineTo(xPoint + 60,yPoint + 270); mountain2.lineTo(xPoint + 70,yPoint + 280); mountain2.lineTo(xPoint + 100,yPoint + 300);
        mountain2.lineTo(xPoint + 110,yPoint + 295); mountain2.lineTo(xPoint + 120,yPoint + 290); mountain2.lineTo(xPoint + 150,yPoint + 280);
        mountain2.lineTo(xPoint + 155,yPoint + 280); mountain2.lineTo(xPoint + 160,yPoint + 295); mountain2.lineTo(xPoint + 180,yPoint + 300);
        mountain2.lineTo(xPoint + 195,yPoint + 290); mountain2.lineTo(xPoint + 220,yPoint + 275); mountain2.lineTo(xPoint + 230,yPoint + 280);
        mountain2.lineTo(xPoint + 240,yPoint + 295); mountain2.lineTo(xPoint + 250,yPoint + 310);
        g2d.setColor(new Color(192,109,81)); 
        g2d.fill(mountain2);

        Rectangle2D.Double block2 = new Rectangle2D.Double(xPoint,yPoint + 310,250,50);
        g2d.fill(block2);

        Path2D.Double mountain3 = new Path2D.Double();
        mountain3.moveTo(xPoint + 250,yPoint + 350);
        mountain3.lineTo(xPoint + 245,yPoint + 340); mountain3.lineTo(xPoint + 230,yPoint + 330); mountain3.lineTo(xPoint + 210,yPoint + 315);
        mountain3.lineTo(xPoint + 190,yPoint + 310); mountain3.lineTo(xPoint + 185,yPoint + 315); mountain3.lineTo(xPoint + 170,yPoint + 310);
        mountain3.lineTo(xPoint + 165,yPoint + 325); mountain3.lineTo(xPoint + 150,yPoint + 335); mountain3.lineTo(xPoint + 140,yPoint + 330);
        mountain3.lineTo(xPoint + 135,yPoint + 335); mountain3.lineTo(xPoint + 130,yPoint + 345); mountain3.lineTo(xPoint + 100,yPoint + 320);
        mountain3.lineTo(xPoint + 80,yPoint + 315); mountain3.lineTo(xPoint + 70,yPoint + 310); mountain3.lineTo(xPoint + 65,yPoint + 310);
        mountain3.lineTo(xPoint + 50,yPoint + 330); mountain3.lineTo(xPoint + 40,yPoint + 325); mountain3.lineTo(xPoint + 35,yPoint + 320);
        mountain3.lineTo(xPoint + 20,yPoint + 330); mountain3.lineTo(xPoint,yPoint + 350);
        g2d.setColor(new Color(165,127,96));
        g2d.fill(mountain3);
       
        RoundRectangle2D.Double block3 = new RoundRectangle2D.Double(xPoint,yPoint + 350,250,100,10,10);
        g2d.fill(block3);
        
        RoundRectangle2D.Double bottomPane = new RoundRectangle2D.Double(xPoint,yPoint + 380,250,70,10,10);
        g2d.setColor(new Color(255,255,244, 70));
        g2d.fill(bottomPane);

        RoundRectangle2D.Double messages = new RoundRectangle2D.Double(xPoint + 10,yPoint + 390,45,45,10,10);
        GradientPaint messageApp = new GradientPaint((int)xPoint + 10,(int) yPoint + 435,new Color(0,228,44),(int) xPoint + 10,(int) yPoint + 390,new Color(139,243,159));
        g2d.setPaint(messageApp);
        g2d.fill(messages);

        Ellipse2D.Double bubble = new Ellipse2D.Double(xPoint + 14,yPoint + 395,38,32);
        g2d.setColor(Color.WHITE);
        g2d.fill(bubble);

        Path2D.Double tail = new Path2D.Double();
        tail.moveTo(xPoint + 21,yPoint + 423);
        tail.curveTo(xPoint + 23,yPoint + 427,xPoint + 21,yPoint + 428,xPoint + 19,yPoint + 430);
        tail.curveTo(xPoint + 25,yPoint + 427,xPoint + 27,yPoint + 428,xPoint + 30,yPoint + 423);
        g2d.fill(tail);

        g2d.setFont(new Font("Helveltica Neue", Font.PLAIN, 10));
        g2d.drawString("Messages",(int) xPoint + 10,(int) yPoint + 447);

        Circle pageCircle1 = new Circle(xPoint + 120,yPoint + 370,5,true);
        pageCircle1.draw(g2d);

        Circle pageCircle2 = new Circle(xPoint + 130,yPoint + 370,5,true);
        g2d.setColor(new Color(255,255,255,70));
        pageCircle2.draw(g2d);

        Circle pageSearch1 = new Circle(xPoint + 110,yPoint + 370,3,false);
        pageSearch1.draw(g2d);

        Line pageSearch2 = new Line(xPoint + 112,yPoint + 373,314,525);
        pageSearch2.draw(g2d);;

        RoundRectangle2D.Double cardApp = new RoundRectangle2D.Double(xPoint + 75,yPoint + 390,45,45,10,10);
        GradientPaint sky = new GradientPaint((int) xPoint + 75, (int) yPoint + 390, new Color(99,172,193),(int) xPoint + 75,(int) yPoint + 435, new Color(255,158,0));
        g2d.setPaint(sky);
        g2d.fill(cardApp);

        Circle sun = new Circle(xPoint + 85,yPoint + 410,20,true);
        g2d.setColor(new Color(255,178,20));
        sun.draw(g2d);

        RoundRectangle2D.Double cardAppBottom1 = new RoundRectangle2D.Double(xPoint + 75,yPoint + 420,45,15,10,10);
        GradientPaint waves = new GradientPaint((int) xPoint + 75,(int) yPoint + 435,new Color(202,233,255),(int) xPoint + 75,(int) yPoint + 420,new Color(138,161,177));
        g2d.setPaint(waves);
        g2d.fill(cardAppBottom1);

        Rectangle2D.Double cardAppBottom2 = new Rectangle2D.Double(xPoint + 75,yPoint + 420,45,4);
        g2d.fill(cardAppBottom2);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN,10));
        g2d.setColor(Color.WHITE);
        g2d.drawString("GreetingCard",(int) xPoint + 69,(int) yPoint + 447);



        Circle signal1 = new Circle(xPoint + 5,yPoint + 5,5,true);
        g2d.setColor(Color.WHITE);
        signal1.draw(g2d);

        Circle signal2 = new Circle(xPoint + 12,yPoint + 5,5,true);
        signal2.draw(g2d);

        Circle signal3 = new Circle(xPoint + 19,yPoint + 5,5,true);
        signal3.draw(g2d);

        Circle signal4 = new Circle(xPoint + 26,yPoint + 5,5,false);
        signal4.draw(g2d);

        Circle signal5 = new Circle(xPoint + 33,yPoint + 5,5,false);
        signal5.draw(g2d);

        g2d.setFont(new Font("Helvetica Neue",Font.PLAIN, 9));
        g2d.drawString("Globe  LTE", (int) xPoint + 42,(int) yPoint + 12);

        g2d.setFont(new Font("Helvetica Neue",Font.PLAIN, 9));
        g2d.drawString("2:45 PM",(int) xPoint + 110,(int) yPoint + 12);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN, 9));
        g2d.drawString("84%",(int) xPoint + 197,(int) yPoint + 13);

        RoundRectangle2D.Double battery1 = new RoundRectangle2D.Double(xPoint + 218, yPoint + 5,25,8,4,4);
        g2d.draw(battery1);

        RoundRectangle2D.Double battery2 = new RoundRectangle2D.Double(xPoint + 219,yPoint + 5, 20,8,2,2);
        g2d.fill(battery2);

        Arc2D.Double batEnd = new Arc2D.Double(xPoint + 242, yPoint + 7,5,5,270,180,Arc2D.OPEN);
        g2d.fill(batEnd);

    }
    
    public void animate()
    {
        
    }
}
