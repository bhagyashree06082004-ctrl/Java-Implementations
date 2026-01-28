import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.*;



class MyFrame extends JFrame {

    MyFrame(){
        JTextField tf1 = new JTextField(15);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField ftf = new JFormattedTextField(df);

        setLayout(new FlowLayout());
        add(tf1);
        add(ftf);

    }

    
}


public class SwingTextField {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


