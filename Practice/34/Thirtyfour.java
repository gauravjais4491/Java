import java.awt.*;
import javax.swing.*;

public class Thirtyfour extends Canvas {
    public void paint(Graphics g){
        Font f=new Font("serif",Font.BOLD,30);
        g.setFont(f);
        g.drawString("Noob_Hacker",50,60);

        setBackground(Color.BLACK);
        g.fillRect(230,50,100,80);
        g.drawOval(30,130,50,60);
        setForeground(Color.RED);
        g.fillOval(130,140,50,60);
        g.drawArc(30, 200, 40, 50, 90, 60);
        g.fillArc(30, 130, 40, 50, 180, 40);

    }
    public static void main(String[] args) {
        Thirtyfour m=new Thirtyfour();
        JFrame j=new JFrame();
        j.add(m);
        j.setSize(500,600);
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        // f.getContentPane().setBackground(Color.cyan);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

