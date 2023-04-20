import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelButtonDemo extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    
    private JButton button;

    public ExcelButtonDemo() {
        button = new JButton("Load Excel Sheet");
        button.addActionListener(this);
        add(button);
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FileInputStream file = new FileInputStream(new File("path/to/excel/file.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0); // assuming the sheet you want to access is the first one
            
            // perform the desired operation on the Excel sheet
            
            workbook.close();
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExcelButtonDemo();
    }

}