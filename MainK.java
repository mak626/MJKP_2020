import java.awt.*;
import java.awt.event.*;

public class MainK extends Frame
{
    MainK()
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

    public static void MainK(String args[])
    {
        MainK frame = new MainK();
    }
}
