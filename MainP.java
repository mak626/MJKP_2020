import java.awt.*;
import java.awt.event.*;

public class MainP extends Frame
{
    Main()
    {

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

        setSize(350, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
    }

    public static void main(String args[])
    {
        MainP frame = new MainP();
    }
}
