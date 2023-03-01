import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Thirtyfive extends Canvas {
    static JLabel l;

    public void paint(Graphics g) {
        Font f = new Font("SERIF", Font.ITALIC, 30);
        g.setColor(Color.BLUE);
        g.setFont(f);
        g.drawString("Noob_Hacker", 200, 50);
        g.setColor(Color.red);
        g.drawRect(184, 13, 230, 50);
        g.setColor(Color.GREEN);
        g.fillRect(150, 150, 400, 250);
        g.setColor(Color.red);
        g.fillOval(300, 225, 100, 100);
        g.setColor(Color.BLUE);
        g.drawLine(110, 210, 320, 160);
        // Pizza
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 200, 200, 30, 300);
        // Slice
        g.setColor(Color.ORANGE);
        g.fillArc(110, 100, 200, 200, 330, 60);
        g.setColor(Color.BLACK);
    }

    public static void main(String[] shruti) {
        Thirtyfive mg = new Thirtyfive();
        JFrame f = new JFrame();
        f.add(mg);
        l = new JLabel("Label");
        f.add(l, BorderLayout.SOUTH);
        mg.addMouseMotionListener(new MyML());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setSize(700, 500);
        f.setVisible(true);
    }
}

class MyML extends MouseAdapter {
    public void mouseMoved(MouseEvent e) {
        Thirtyfive.l.setText(e.getX() + ", " + e.getY());
    }
}
