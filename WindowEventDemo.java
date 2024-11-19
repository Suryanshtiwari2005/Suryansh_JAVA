import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener{
    Label l;

    MyFrame()
    {
        super("WindowEvent Demo");
        l = new Label("        ");

        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }
    @Override
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window opened");
    }
    @Override
    public void windowClosed(WindowEvent we)
    {
        l.setText("Window Closed");
    }
    @Override
    public void windowClosing(WindowEvent we)
    {
        l.setText("Window Closing");
        System.exit(0);
    }
    @Override
    public void windowIconified(WindowEvent e)
    {
        l.setText("Window Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent we)
    {
        l.setText("Window Deiconified");

    }
    @Override
    public void windowActivated(WindowEvent we)
    {
        l.setText("Window Activated");
    }
    @Override
    public void windowDeactivated(WindowEvent we)
    {
        l.setText("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
