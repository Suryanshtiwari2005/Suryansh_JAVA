import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    TextField tf;
    Button b;
    int cnt = 0;

    MyFrame() {
        super("Event Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        addWindowListener(new MyWindowAdapter());

        b.addActionListener((ActionEvent ae) -> {
            cnt++;
            tf.setText(String.valueOf(cnt));
        });
    }

    class MyWindowAdapter extends WindowAdapter {// Added cus i have to kill terminal EveryTime
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

}

public class WayOfEventHandling {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
