import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;

public class SummerGreeting1 implements Shape{
    private double xPoint;
    private double yPoint;

    private int timer;
    private int o;
    private int f;

    private Rectangle2D.Double transition1;

    public SummerGreeting1(double x, double y)
    {
        xPoint = x;
        yPoint = y;
        timer = 0;
        o = 0;
        f = 0;
    }

    public void draw(Graphics2D g2d)
    {   
        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(xPoint, yPoint, 250, 450, 10, 10);
        g2d.setColor(new Color(215,218,229));
        g2d.fill(screen);

        Rectangle2D.Double sunRay = new Rectangle2D.Double(xPoint,yPoint + 55,250,270);
        RoundGradientPaint rgp = new RoundGradientPaint(xPoint + 120, yPoint + 190, new Color(255,200,0,0 + o), new Point2D.Double(100, 100), new Color(215,218,229,0 + o));
        g2d.setPaint(rgp);
        g2d.fill(sunRay);

        Ellipse2D.Double sunBG = new Ellipse2D.Double(xPoint + 38,yPoint + 100,170,170);
        g2d.setColor(new Color(255,200,0,0 + o));
        g2d.fill(sunBG);

        g2d.setFont(new Font("Lighthouse Personal Use", Font.PLAIN, 50));
        g2d.setColor(new Color(69,69,69, 0 + o));
        g2d.drawString("Summer",(int) xPoint + 50,(int) yPoint + 200);

        g2d.setFont(new Font("Optima", Font.PLAIN, 22));
        g2d.drawString("2 0 1 6",(int) xPoint + 90,(int) yPoint + 220);

        g2d.setFont(new Font("Optima",Font.PLAIN,18));
        g2d.drawString("SUN, FUN & FRIENDS",(int) xPoint + 35,(int) yPoint + 350);

        g2d.setColor(new Color(215,218,229));
        g2d.fill(transition1);
    }

    public void animate()
    {
        f = 13 * timer;
        o = 17 * timer;
        transition1 = new Rectangle2D.Double(xPoint + 35 + f,yPoint + 333,195-f,20);
        timer++;
        if(timer == 15)
        {
            timer = 15;
        }
    }

    class RoundGradientPaint implements Paint {
        protected Point2D point;

        protected Point2D mRadius;

        protected Color mPointColor, mBackgroundColor;

        public RoundGradientPaint(double x, double y, Color pointColor,Point2D radius, Color backgroundColor) {
            if (radius.distance(0, 0) <= 0)
                throw new IllegalArgumentException("Radius must be greater than 0.");
            point = new Point2D.Double(x, y);
            mPointColor = pointColor;
            mRadius = radius;
            mBackgroundColor = backgroundColor;
        }

        public PaintContext createContext(ColorModel cm, java.awt.Rectangle deviceBounds,Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
            Point2D transformedPoint = xform.transform(point, null);
            Point2D transformedRadius = xform.deltaTransform(mRadius, null);
            return new RoundGradientContext(transformedPoint, mPointColor,
                transformedRadius, mBackgroundColor);
        }

        public int getTransparency() {
            int a1 = mPointColor.getAlpha();
            int a2 = mBackgroundColor.getAlpha();
            return (((a1 & a2) == 0xff) ? OPAQUE : TRANSLUCENT);
        }
    }

    class RoundGradientContext implements PaintContext {
        protected Point2D mPoint;

        protected Point2D mRadius;

        protected Color color1, color2;

        public RoundGradientContext(Point2D p, Color c1, Point2D r, Color c2) {
            mPoint = p;
            color1 = c1;
            mRadius = r;
            color2 = c2;
        }

        public void dispose() {
        }

        public ColorModel getColorModel() {
            return ColorModel.getRGBdefault();
        }

        public Raster getRaster(int x, int y, int w, int h) {
            WritableRaster raster = getColorModel().createCompatibleWritableRaster(w, h);

            int[] data = new int[w * h * 4];
            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {
                    double distance = mPoint.distance(x + i, y + j);
                    double radius = mRadius.distance(0, 0);
                    double ratio = distance / radius;
                    if (ratio > 1.0)
                        ratio = 1.0;

                    int base = (j * w + i) * 4;
                    data[base + 0] = (int) (color1.getRed() + ratio
                        * (color2.getRed() - color1.getRed()));
                    data[base + 1] = (int) (color1.getGreen() + ratio
                        * (color2.getGreen() - color1.getGreen()));
                    data[base + 2] = (int) (color1.getBlue() + ratio
                        * (color2.getBlue() - color1.getBlue()));
                    data[base + 3] = (int) (color1.getAlpha() + ratio
                        * (color2.getAlpha() - color1.getAlpha()));
                }
            }
            raster.setPixels(0, 0, w, h, data);

            return raster;
        }
    }
}
