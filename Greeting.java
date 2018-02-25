import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;

public class Greeting extends JComponent
{
    
    public static void main(String[] args)
    {
        int w = 750;
        int h = 800;
        
        JFrame f = new JFrame();
        f.setSize(w,h);
        f.setTitle("Habana, Miguel - CS21B Sec A");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        GreetingCard gc = new GreetingCard(w,h);
        f.add(gc);
        f.revalidate();
        
        
        boolean running = true;
        
        while(running)
        {
            gc.repaint();
        }
        
    }
}
