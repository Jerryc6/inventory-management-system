package projFile.com.login;
import javax.swing.JTextField;
import projFile.com.GUI.WindowFrame;


public class login {

    JTextField user = new JTextField();

    public void box(){
        WindowFrame wf = new WindowFrame();
        wf.setVisible(true);
        wf.add(user);
        user.setSize(20, 10);
        

    }

}
