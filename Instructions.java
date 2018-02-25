import java.awt.*;
import java.awt.geom.*;

public class Instructions implements Shape
{
    private double xPoint;
    private double yPoint;

    public Instructions(int x, int y)
    {
        xPoint = x;
        yPoint = y;
    }
    
    public void draw(Graphics2D g2d)
    {   
        
        Path2D.Double line1 = new Path2D.Double();
        line1.moveTo(xPoint,yPoint);
        line1.curveTo(xPoint,10,xPoint + 80,yPoint - 50,xPoint + 130,yPoint + 50);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(line1);
        
        Path2D.Double arrow1 = new Path2D.Double();
        arrow1.moveTo(xPoint,yPoint); arrow1.lineTo(xPoint,yPoint + 15);
        arrow1.lineTo(xPoint - 5,yPoint); arrow1.lineTo(xPoint + 5,yPoint); arrow1.lineTo(xPoint,yPoint + 15);
        g2d.fill(arrow1);
               
        g2d.setFont(new Font("Didot", Font.PLAIN, 20));
        g2d.drawString("Click to Unlock!",(int) xPoint + 80,(int) yPoint + 80);
        
        Path2D.Double line2 = new Path2D.Double();
        line2.moveTo(xPoint  - 95,yPoint + 650);
        line2.curveTo(xPoint  - 95,yPoint + 685,xPoint + 30,yPoint + 735,xPoint + 130,yPoint + 550);
        g2d.draw(line2);
        
        Path2D.Double arrow2 = new Path2D.Double();
        arrow2.moveTo(xPoint - 95,yPoint + 650); arrow2.lineTo(xPoint - 95,yPoint + 635);
        arrow2.lineTo(xPoint - 90,yPoint + 650); arrow2.lineTo(xPoint - 100,yPoint + 650); arrow2.lineTo(xPoint - 95,yPoint + 635);
        g2d.fill(arrow2);
       
        g2d.drawString("Click for Home Screen!",(int) xPoint + 80,(int) yPoint + 530);
        
        g2d.setStroke(new BasicStroke(1));
    }
    
    public void animate()
    {
        
    }
}
