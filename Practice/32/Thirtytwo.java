import java.awt.*;
import javax.swing.*;

public class Thirtytwo {
    Thirtytwo(){
        JFrame jf=new JFrame("Grid Layout Example");
        jf.setSize(500,600);
        for(int i=0;i<10;i++)
        {
            jf.add(new Button(""+i));
        }
        // b1.setForeground(Color.red);
        jf.setLayout(new GridLayout(5,6,20,30));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.blue);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        new Thirtytwo();
    }
    
}
