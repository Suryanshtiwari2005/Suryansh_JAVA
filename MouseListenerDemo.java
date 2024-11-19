import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener {

    Label positionLabel, statusLabel;

    public MyFrame() {
        super("MouseListener Demo");

        positionLabel = new Label("");
        statusLabel = new Label("");

        setLayout(null);

        positionLabel.setBounds(30, 20, 200, 20);
        statusLabel.setBounds(30, 50, 200, 20);

        add(positionLabel);
        add(statusLabel);

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        positionLabel.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
        statusLabel.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the Screen");
        positionLabel.setText("");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the Screen");
        positionLabel.setText("");
    }
}

public class MouseListenerDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
