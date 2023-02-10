import java.awt.*;
import javax.swing.*;

public class Thirtyone {
    Thirtyone(){
        JFrame jf=new JFrame("My FlowPanel");
        // we have to check implimentaion of fo
        // Font f=new Font("Serif",Font.BOLD,30);
        jf.setSize(200,350);
        jf.getContentPane().setBackground(Color.cyan);

        FlowLayout f1=new FlowLayout(FlowLayout.LEFT,20,10);
        jf.setLayout(f1);
        for(int i=0;i<10;i++)
        {
            jf.add(new Button(" "+i));
        }
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new Thirtyone();
    }
}
