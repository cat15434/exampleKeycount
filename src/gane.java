import javax.swing.*;
import java.awt.*;

public class gane {
    static JFrame window;
    static Container con;
    static JLabel Counter;
    static int count;
    Font font1 = new Font (Font.SANS_SERIF,Font.BOLD,50);
    KeyListener kL = new KeyListener();
    public static void main(String[] args){

        new gane();

    }
    public gane(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addKeyListener(kL);
        con = window.getContentPane();

        Counter = new JLabel(String.valueOf(count));
        Counter.setFont(font1);

        con.add(Counter);
        window.setVisible(true);


    }

}
