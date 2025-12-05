package projFile.com.GUI;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowFrame extends JFrame{
    JTextField user = new JTextField();

    public WindowFrame(){
        setTitle("Windows");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }


}
