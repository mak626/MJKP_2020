import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Main extends Frame implements MouseMotionListener
{
    static int xPixel = 0;
    static int yPixel = 0;
    static int xSky = 0;
    static int ySky = 0;
    Random num;
    Image rocket;
    Button liftOff;

    public Main()
    {

        num = new Random();
        // liftOff = new Button("Lift OFF");
        // liftOff.setBounds(800, 200, 30, 20);
        // add(liftOff);

        addMouseMotionListener(this);
        rocket = Toolkit.getDefaultToolkit().getImage("rocket.png");

        setSize(1000, 1000);

        setTitle("MJKP 2020 Rocket Launching");
        setVisible(true);
        paint();

    }

    public void mouseDragged(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e)
    {
        xPixel = e.getX();
        yPixel = e.getY();
        paint();
    }

    public void paint()
    {
        Graphics sky = getGraphics();
        Graphics g = getGraphics();
        try
        {
            g.fillRect(0, 0, 2000, 2000);
            g.drawImage(rocket, xPixel, yPixel, this);

            for (int i = 0; i < 100; i++)
            {
                xSky = num.nextInt(1000);
                ySky = num.nextInt(1000);
                sky.setColor(Color.WHITE);
                sky.fillOval(xSky, ySky, 5, 5);
            }
            Thread.sleep(60);
        } catch (Exception e)
        {
        }

    }

    public static void main(String args[])
    {
        Main me = new Main();
    }
}