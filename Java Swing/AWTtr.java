import java.awt.*;

class MyFrame extends Frame {
    MyFrame(){
        TextField tf =  new TextField(20);
        Button b = new Button("Click");


        setLayout(new FlowLayout());
        add(tf);
        add(b);

        MenuBar mb = new MenuBar();
        Menu file = new Menu("File");
        MenuItem o = new MenuItem("Open");
        MenuItem c = new MenuItem("Close");

        file.add(o);
        file.add(c);
        mb.add(file);
        setMenuBar(mb);
        

    }
}


class AWTtr {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
        f.setSize(400,300);

    }

    
}
