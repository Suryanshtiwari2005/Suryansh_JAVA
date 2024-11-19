import java.awt.*;
import java.awt.event.ActionListener;

import org.w3c.dom.Text;

class MyFrame extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public MyFrame()
    {
        super("My App");

        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Ok");

        add(l);
        add(tf);
        add(b);

    }
}

public class FirstApp extends Frame{

    public static void main(String[] args)
    {
         MyFrame f = new MyFrame();
         f.setSize(400,400);
         f.setVisible(true);

    }
}
