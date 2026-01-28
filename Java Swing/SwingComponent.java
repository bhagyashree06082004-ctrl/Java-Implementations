import java.awt.FlowLayout;
//import java.awt.Frame;

import javax.swing.*;

class MyFrame extends JFrame {

    JLabel l;
    JButton b;
    int count =0;

    MyFrame()
    {
        super("Swings Demo");


        setLayout(new FlowLayout());
        l = new JLabel("Clicked "+count+" Times");
        b = new JButton("Click");

        

        add(l);
        add(b);


    }
}




public class SwingComponent {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
