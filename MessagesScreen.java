import java.awt.*;
import java.awt.geom.*;

public class MessagesScreen implements Shape {

    private double xPoint;
    private double yPoint;

    public MessagesScreen(double x, double y)
    {
        xPoint = x;
        yPoint = y;
    }

    public void draw(Graphics2D g2d) {
        RoundRectangle2D.Double wbg = new RoundRectangle2D.Double(xPoint,yPoint,250,xPoint + 250,10,10);
        g2d.setColor(new Color(240,240,240));
        g2d.fill(wbg);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        g2d.setColor(Color.BLUE);
        g2d.drawString("Edit",(int) xPoint + 7,(int) yPoint + 40);

        g2d.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        g2d.setColor(Color.BLACK);
        g2d.drawString("Messages",(int) xPoint + 92,(int) yPoint + 40);

        Rectangle2D.Double grayBar = new Rectangle2D.Double(xPoint,yPoint + 50,250,30);
        g2d.setColor(new Color(152,152,152));
        g2d.fill(grayBar);

        RoundRectangle2D.Double searchBar = new RoundRectangle2D.Double(xPoint + 5,yPoint + 55,240,20,10,10);
        g2d.setColor(Color.WHITE);
        g2d.fill(searchBar);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN,11));
        g2d.setColor(new Color(152,152,152));
        g2d.drawString("Search",(int) xPoint + 117,(int) yPoint + 68);

        Circle search1 = new Circle(xPoint + 102,yPoint + 60,6,false);
        search1.draw(g2d);

        Line search2 = new Line(xPoint + 107,yPoint + 66,310,219);
        search2.draw(g2d);

        g2d.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        g2d.setColor(Color.BLACK);
        g2d.drawString("Mom",(int) xPoint + 20,(int) yPoint + 100);

        g2d.drawString("GLOBE",(int) xPoint + 20,(int) yPoint + 155);

        g2d.drawString("+63 123 456 7890",(int) xPoint + 20,(int) yPoint + 215);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN, 11));
        g2d.setColor(new Color(152,152,152));
        g2d.drawString("11:17 AM",(int) xPoint + 185,(int) yPoint + 100);

        Path2D.Double arrow1 = new Path2D.Double();
        arrow1.moveTo(xPoint + 238,yPoint + 91);
        arrow1.lineTo(xPoint + 243,yPoint + 95); arrow1.lineTo(xPoint + 238,yPoint + 99);
        g2d.draw(arrow1);

        g2d.drawString("Where are you now?",(int) xPoint + 20,(int) yPoint + 115);

        Line line1 = new Line(xPoint + 20,yPoint + 135,xPoint + 250,yPoint + 135);
        line1.draw(g2d);

        g2d.drawString("8:42 AM",(int) xPoint + 190,(int) yPoint + 155);
        
        Path2D.Double arrow2 = new Path2D.Double();
        arrow2.moveTo(xPoint + 238,yPoint + 146);
        arrow2.lineTo(xPoint + 243,yPoint + 150); arrow2.lineTo(xPoint + 238,yPoint + 154);
        g2d.draw(arrow2);

        g2d.drawString("Visit the Globe store and check out the",(int) xPoint + 20,(int) yPoint + 170);
        g2d.drawString("SM Marikina 3 Day sale form March 18...",(int) xPoint + 20,(int) yPoint + 185);

        Line line2 = new Line(xPoint + 20,yPoint + 195,xPoint + 250,yPoint + 195);
        line2.draw(g2d);

        g2d.drawString("Yesterday",(int) xPoint + 180,(int) yPoint + 215);
        Path2D.Double arrow3 = new Path2D.Double();
        arrow3.moveTo(xPoint + 238,yPoint + 206);
        arrow3.lineTo(xPoint + 243,yPoint + 210); arrow3.lineTo(xPoint + 238,yPoint + 214);
        g2d.draw(arrow3);

        g2d.drawString("Foodccart Franchise",(int) xPoint + 20,(int) yPoint + 230);
        g2d.drawString("P20,000 ONLY...",(int) xPoint + 20,(int) yPoint + 245);

        Line line3 = new Line(xPoint + 20,yPoint + 255,xPoint + 250,yPoint + 255);
        line3.draw(g2d);

        Circle signal1 = new Circle(xPoint + 5,yPoint + 5,5,true);
        g2d.setColor(Color.BLACK);
        signal1.draw(g2d);

        Circle signal2 = new Circle(xPoint + 12,yPoint + 5,5,true);
        signal2.draw(g2d);

        Circle signal3 = new Circle(xPoint + 19,yPoint + 5,5,true);
        signal3.draw(g2d);;

        Circle signal4 = new Circle(xPoint + 26,yPoint + 5,5,false);
        signal4.draw(g2d);

        Circle signal5 = new Circle(xPoint + 33,yPoint + 5,5,false);
        signal5.draw(g2d);

        g2d.setFont(new Font("Helvetica Neue",Font.PLAIN, 9));
        g2d.drawString("Globe  LTE",(int) xPoint + 42,(int) yPoint + 12);

        g2d.setFont(new Font("Helvetica Neue",Font.PLAIN, 9));
        g2d.drawString("2:45 PM",(int) xPoint + 110,(int) yPoint + 12);

        g2d.setFont(new Font("Helvetica Neue", Font.PLAIN, 9));
        g2d.drawString("84%",(int) xPoint + 197,(int) yPoint + 13);

        RoundRectangle2D.Double battery1 = new RoundRectangle2D.Double(xPoint + 218, yPoint + 5,25,8,4,4);
        g2d.draw(battery1);

        RoundRectangle2D.Double battery2 = new RoundRectangle2D.Double(xPoint + 219,yPoint + 5, 20,8,2,2);
        g2d.fill(battery2);

        Arc2D.Double batEnd = new Arc2D.Double(xPoint + 242, 157,5,5,270,180,Arc2D.OPEN);
        g2d.fill(batEnd);
    }

    public void animate(){

    }
}
