package projFile.com.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class WindowFrame{
    

    public void Body(){
    
	    SwingUtilities.invokeLater(() ->{
	    
		    JFrame frame = new JFrame("Inventory");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setPreferredSize(new Dimension(1200,700));

		    frame.setLayout(new BorderLayout());

		    JPanel upperPanel. = new JPanel(new FlowLayout());
		    frame.add();



	    
	    
	    




		    frame.pack();
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
	    });
    
    }


}
