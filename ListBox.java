import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener{
    List l;
    Choice c;
    TextArea ta;

    MyFrame()
    {
        super("ListBox Demo");

        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("April");
        c.add("Jun");
        c.add("July");
        c.add("August");
        c.add("Sept");
        c.add("Octo");
        c.add("Nov");
        c.add("Dec");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);

    }
    @Override
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource() == l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String list[] = l.getSelectedItems();
        String txt="";

        for(String x:list)
            txt+=x+"\n";

        ta.setText(txt);
        l.addItem(txt);
    }
}

public class ListBox {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
