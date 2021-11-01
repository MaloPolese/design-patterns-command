
import java.awt.Dimension;

import javax.swing.JFrame;

import invoker.Invoker;

public class Windows extends JFrame {

    public Windows(int width, int height) {
        this.setSize(new Dimension(width, height));
        this.setContentPane(new Invoker());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
