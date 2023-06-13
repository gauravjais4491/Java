import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Thritynine {
    static JComboBox<String> cb;
    static CardLayout cl;
    static JPanel p;
    static JButton prev, next;

    public static void main(String[] args) {
        JFrame f = new JFrame("Color chooser");
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        p = new JPanel();
        cl = new CardLayout();
        p.setLayout(cl);
        f.add(p);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        p.add(p1, "red");

        JPanel p2 = new JPanel();
        p2.setBackground(Color.green);
        p.add(p2, "Green");

        JPanel p3 = new JPanel();
        p3.setBackground(Color.cyan);
        p.add(p3, "Cyan");

        JPanel p4 = new JPanel();
        p4.setBackground(Color.orange);
        p.add(p4, "Orange");

        JPanel p5 = new JPanel();
        p5.setBackground(Color.yellow);
        p.add(p5, "Yellow");

        JPanel buttons = new JPanel();
        prev = new JButton("Next");
        next = new JButton("Previous");
        buttons.add(prev);
        buttons.add(next);
        f.add(buttons, BorderLayout.SOUTH);

        String[] color = { "green", "cyan", "black", "blue", "orange" };
        cb = new JComboBox<String>(color);
        buttons.add(cb);
        MyListener ml = new MyListener();
        prev.add(ActionListener(ml));
        next.add(ActionListener(ml));
        f.setVisible(true);
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Thritynine.prev)
        {
            Thritynine.cl.next(Thritynine.p);
        }
        else if(e.getSource()==Thritynine.next)
        {
            Thritynine.cl.next(Thritynine.p);
        }
        else if(e.getSource()==Thritynine.cb)
        {
            String selected =(String)Thritynine.cb.getSelectedItem();
            Thritynine.cl.show(Thritynine.p, selected);
        }
    }
}