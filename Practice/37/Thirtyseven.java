import java.awt.*;
import javax.swing.*;

public class Thirtyseven {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Menu");
        f.setSize(700, 600);
        f.getContentPane().setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        String[] columns = { "Item", "Price" };
        Object[][] data = { { "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 },{ "Coffee", 40 }, { "Noodles", 30 }, { "Burger", 100 }, { "Pizza", 120 } };
        JTable jt = new JTable(data, columns);
        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        JScrollPane jsp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        p.add(jsp);
        f.add(p);
        f.setVisible(true);
    }
}
