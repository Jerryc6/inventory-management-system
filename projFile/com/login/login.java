package projFile.com.login;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login {

    JFrame mainFrame = new JFrame("Login Page!!");
    JPanel mainBackground = new JPanel();
    JLabel userLabel = new JLabel("Username:");
    JTextField user = new JTextField();
    JLabel passLabel = new JLabel("Password:");
    JPasswordField pass = new JPasswordField();
    JButton logBtn = new JButton("Login");

    public void mainBody(){
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 700);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        mainFrame.add(mainBackground);
        mainBackground.setBounds(0, 0, 500, 700);
        mainBackground.setBackground(Color.CYAN);
        mainBackground.setLayout(null);

        mainBackground.add(userLabel); // Username label
        userLabel.setBounds(50, 100, 400, 50);
        
        mainBackground.add(user); // user input
        user.setBounds(50, 150, 400, 50);

        mainBackground.add(passLabel); 
        passLabel.setBounds(50, 200, 400, 50);
        mainBackground.add(pass);
        pass.setBounds(50, 250, 400, 50);


        mainBackground.add(logBtn);
        logBtn.setBounds(50, 350, 400, 50);


    }

    public static void main(String [] args){
        login l = new login();
        l.mainBody();

    }

}
