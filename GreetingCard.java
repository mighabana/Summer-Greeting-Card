import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.io.*;

public class GreetingCard extends JComponent{
    private int width;
    private int height;
    private boolean isLocked;
    private boolean isHomeScreen;
    private boolean isMessages;
    private boolean isGreetingApp;
    private boolean isGreetingCard;
    private boolean isLoaded;
    private boolean isNotified;
    private boolean isSummerGreeting1;
    private boolean isSummerGreeting2;

    private ArrayList<Shape> allShapes = new ArrayList<Shape>();

    private int x1 = 0;
    public GreetingCard(int w, int h)
    {
        width = w;
        height = h;
        isLocked = true;
        isHomeScreen = false;
        isMessages = false;
        isGreetingApp = false;
        isGreetingCard = false;
        isLoaded = false;
        isNotified = true;
        isSummerGreeting1 = false;
        isSummerGreeting2 = false;
        /*
         * KeyListener failed to work when I ran the class on the terminal
         * Switched to key binding
         * Key binding also failed to work on the terminal
         * decided to keep key binding because of suggested reusability and efficiency based on online comments
         * 
        this.setFocusable(true);
        this.addKeyListener(new BoatListener());
        
        */
        this.addMouseListener(new LockListener());
        this.addMouseListener(new HomeListener());
        this.addMouseListener(new MessagesListener());
        this.addMouseListener(new GreetingCardListener());
        this.addMouseListener(new GreetingListener());
        this.addMouseListener(new NextListener());
        this.addMouseListener(new NotificationListener());

        AnimateListener a = new AnimateListener();
        Timer t = new Timer(100, a);
        t.start();

        addAll();

        getInputMap().put(KeyStroke.getKeyStroke("W"), "W pressed");
        getInputMap().put(KeyStroke.getKeyStroke("A"), "A pressed");
        getInputMap().put(KeyStroke.getKeyStroke("S"), "S pressed");
        getInputMap().put(KeyStroke.getKeyStroke("D"), "D pressed");
        getInputMap().put(KeyStroke.getKeyStroke("released W"), "released");
        getInputMap().put(KeyStroke.getKeyStroke("released A"), "released");
        getInputMap().put(KeyStroke.getKeyStroke("released S"), "released");
        getInputMap().put(KeyStroke.getKeyStroke("released D"), "released");
        getActionMap().put("W pressed", new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) {                    
                    ((Drawing) allShapes.get(7)).getBoat().setUP();
                }
            });
        getActionMap().put("A pressed", new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) {                    
                    ((Drawing) allShapes.get(7)).getBoat().setLEFT();
                }
            });
        getActionMap().put("S pressed", new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) {                    
                    ((Drawing) allShapes.get(7)).getBoat().setDOWN();
                }
            });
        getActionMap().put("D pressed", new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) {                    
                    ((Drawing) allShapes.get(7)).getBoat().setRIGHT();
                }
            });
        getActionMap().put("released", new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) {
                    ((Drawing) allShapes.get(7)).getBoat().restart();
                }
            });

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try{
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Lighthouse_PersonalUse.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Nilland.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Helvetica Neue.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Optima.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Avenir.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Pilgiche.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Futura.ttc")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("LucidaBlackletter.ttf")));
        }
        catch (IOException | FontFormatException e) {

        }

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        ((IPhone) allShapes.get(0)).draw(g2d);

        ((Instructions) allShapes.get(1)).draw(g2d);

        if(isLocked == false && isHomeScreen == false)
        {
            ((LockScreen) allShapes.get(2)).draw(g2d);
        }   

        if(isLocked == false && isHomeScreen == true)
        {
            ((HomeScreen) allShapes.get(3)).draw(g2d);
        }

        if(isMessages)
        {
            ((MessagesScreen) allShapes.get(4)).draw(g2d);
        }

        if(isGreetingApp)
        {
            ((LoadingScreen) allShapes.get(5)).draw(g2d);

            if(isLoaded)
            {     
                ((GreetingScreen) allShapes.get(6)).draw(g2d);
            }
            if(isGreetingCard)
            {
                ((Drawing) allShapes.get(7)).draw(g2d);
                if(isNotified)
                {
                    ((Notification) allShapes.get(10)).draw(g2d);
                }
            }
            if(isSummerGreeting1)
            {
                ((SummerGreeting1) allShapes.get(8)).draw(g2d);
            }
            if(isSummerGreeting2)
            {
                ((SummerGreeting2) allShapes.get(9)).draw(g2d);
            }
        }
    }

    public void addAll()
    {
        IPhone iphone = new IPhone(175 ,75);
        allShapes.add(iphone);

        Instructions instructions = new Instructions(420,50);
        allShapes.add(instructions);

        LockScreen ls = new LockScreen(200,150);
        allShapes.add(ls);

        HomeScreen hs = new HomeScreen(200,150);
        allShapes.add(hs);

        MessagesScreen ms = new MessagesScreen(200,150);
        allShapes.add(ms);

        LoadingScreen los = new LoadingScreen(200,150);
        allShapes.add(los);

        GreetingScreen gs = new GreetingScreen(200,150);
        allShapes.add(gs);

        Drawing d = new Drawing(200,150);
        allShapes.add(d);

        SummerGreeting1 sg1 = new SummerGreeting1(200,150);
        allShapes.add(sg1);

        SummerGreeting2 sg2 = new SummerGreeting2(200,150);
        allShapes.add(sg2);

        Notification notification = new Notification(220,250);
        allShapes.add(notification);
    }

    public void animateAll()
    {
        if(isGreetingApp == true && isGreetingCard == false && isSummerGreeting1 == false && isSummerGreeting2 == false){
            ((LoadingScreen)allShapes.get(5)).animate();
            x1++;
            if(x1 == 25){
                isLoaded = true;
                x1 = 0;
            }   
        }
        if(isGreetingCard == true && isSummerGreeting1 == false && isSummerGreeting2 == false && isNotified == false)
        {
            ((Drawing) allShapes.get(7)).animate();
        }
        if(isSummerGreeting1 == true && isSummerGreeting2 == false)
        {        

            ((SummerGreeting1) allShapes.get(8)).animate();
            x1++;
            if(x1 == 50)
            {

                isSummerGreeting1 = false;
                isSummerGreeting2 = true;
                x1 = 0;
                allShapes.set(9,new SummerGreeting2(200,150));
            }
        }
        if(isSummerGreeting2)
        {
            ((SummerGreeting2) allShapes.get(9)).animate();
            x1++;
            if(x1 == 155)
            {
                isSummerGreeting2 = false;
                x1 = 0;
            }
            if(((SummerGreeting2) allShapes.get(9)).getRestart())
            {
                allShapes.set(9, new SummerGreeting2(200,150)); 
            }

        }

        repaint();
    }

    class AnimateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {   
            animateAll();
        }
    }

    class LockListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            int x = e.getX();
            int y = e.getY();

            if( (x >= 400 && x <= 440) && (y >=71 && y <= 81))
            {
                if(isLocked){
                    isLocked = false;
                    isHomeScreen = false;
                }

                else{
                    isLocked = true;
                    isMessages = false;
                    isGreetingApp = false;
                    isLoaded = false;
                    isGreetingCard = false;
                    isSummerGreeting1 = false;
                    isSummerGreeting2 = false;
                }

                x1 = 0;
            }

        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class HomeListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            int x = e.getX();
            int y = e.getY();
            if( (x >= 300 && x <= 350) && (y >=615 && y <= 665))
            {

                if(isLocked == false && isHomeScreen == false)
                {

                    if( (x >= 300 && x <= 350) && (y >=615 && y <= 665))
                    {
                        if(isHomeScreen){
                            isHomeScreen = false;
                            isMessages = false;
                        }
                        else{
                            isHomeScreen = true;
                            isMessages = false;

                        }
                    }
                }
                else if(isMessages || isGreetingApp)
                {

                    isHomeScreen = true;
                    isLocked = false;
                    isMessages = false;
                    isGreetingApp = false;
                    isLoaded = false;
                    isGreetingCard = false;
                    isSummerGreeting1 = false;
                    isSummerGreeting2 = false;
                }

                x1 = 0;
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class MessagesListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            if(isLocked == false && isHomeScreen == true && isMessages == false && isGreetingApp == false){
                int x = e.getX();
                int y = e.getY();

                if( (x >= 210 && x <= 255) && (y >=540 && y <= 585))
                {
                    if(isMessages == false)
                        isMessages = true;
                }
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class GreetingCardListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            if(isLocked == false && isHomeScreen == true && isGreetingApp == false && isMessages == false){
                int x = e.getX();
                int y = e.getY();

                if( (x >= 275 && x <= 320) && (y >=540 && y <= 585))
                {
                    if(isGreetingApp == false)
                        isGreetingApp = true;

                }
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class GreetingListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            if(isLoaded){
                int x = e.getX();
                int y = e.getY();

                if( (x >= 225 && x <= 295) && (y >=255 && y <= 295))
                {
                    if(isGreetingCard == false){
                        isGreetingCard = true;
                        isNotified = true;
                        allShapes.set(7,new Drawing(200,150));
                    }
                }
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class NotificationListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            if(isNotified){
                int x = e.getX();
                int y = e.getY();

                if( (x >= 278 && x <= 378) && (y >=417 && y <= 437))
                {
                    isNotified = false;
                }
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }

    class NextListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {

            if(isGreetingCard){
                int x = e.getX();
                int y = e.getY();

                if( (x >= 395 && x <= 425) && (y >=170 && y <= 190))
                {
                    if(isSummerGreeting1 == false){
                        isGreetingCard = false;
                        isSummerGreeting1 = true;
                        allShapes.set(8, new SummerGreeting1(200,150));
                    }
                }
            }
        }

        public void mouseEntered(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {

        }

        public void mouseExited(MouseEvent e)
        {

        }
    }
    /*
    
    class BoatListener implements KeyListener
    {
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_A) {
                ((Drawing) allShapes.get(7)).getBoat().setLEFT();
            }

            else if (e.getKeyCode() == KeyEvent.VK_D) {
                ((Drawing) allShapes.get(7)).getBoat().setRIGHT();
            }

            else if (e.getKeyCode() == KeyEvent.VK_W) {
                ((Drawing) allShapes.get(7)).getBoat().setUP();
            }

            else if (e.getKeyCode() == KeyEvent.VK_S) {
                ((Drawing) allShapes.get(7)).getBoat().setDOWN();
            }

        }

        public void keyReleased(KeyEvent e)
        {

            if (e.getKeyCode() == KeyEvent.VK_A) {
                ((Drawing) allShapes.get(7)).getBoat().restart();
            }

            else if (e.getKeyCode() == KeyEvent.VK_D) {
                ((Drawing) allShapes.get(7)).getBoat().restart();
            }

            else if (e.getKeyCode() == KeyEvent.VK_W) {
                ((Drawing) allShapes.get(7)).getBoat().restart();
            }

            else if (e.getKeyCode() == KeyEvent.VK_S) {
                ((Drawing) allShapes.get(7)).getBoat().restart();
            }
        }

        public void keyTyped(KeyEvent e)
        {
        }
    }
    */
}
