import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // We use this one for things like counting and game player movement
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            gane.count+=1;
            System.out.println(gane.count);
            gane.Counter.setText(String.valueOf(gane.count));
            gane.con.revalidate();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
