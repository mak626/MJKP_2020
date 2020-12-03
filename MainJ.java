import java.awt.*;
import java.awt.event.*;

public class MainJ extends Frame
{
    MainJ()
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

    public static void MainJ(String args[])
    {
        MainJ frame = new MainJ();
    }
}
