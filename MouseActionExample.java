import javax.swing.*;
import java.awt.event.*;

public class MouseActionExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseActionExample() {
        label = new JLabel("Perform a mouse action");
        label.setBounds(50, 100, 200, 20);
        add(label);

        addMouseListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseActionExample();
    }
}