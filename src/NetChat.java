import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NetChat extends JFrame {

    JPanel jpNorth = new JPanel(new GridLayout());
    JPanel jpSouth = new JPanel(new GridLayout());

    JButton jb = new JButton("Послать");
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    JTextField jtf = new JTextField();
    public NetChat() {

        setTitle("Сетевой чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 400, 400);
        setVisible(true);



    }


}
