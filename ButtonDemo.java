import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    int cnt = 0;
    Label l;
    Button b;

    public MyFrame()
    {
        super("Button Demo");

        l = new Label("   "+cnt);
        b = new Button("Click");
        b.addActionListener(this);

        this.setBackground(Color.BLUE);
        
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.RED);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        cnt++;
        l.setText(" "+cnt);
    }
}

public class ButtonDemo {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
