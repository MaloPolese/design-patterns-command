package invoker;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Button;

public class Invoker extends JPanel {
    public String clipboard;
    private Button redButton;
    private Button blueButton;
    private Button yellowButton;
    private Button undoButton;

    public Invoker() {
        redButton = new Button("Red");
        blueButton = new Button("Blue");
        yellowButton = new Button("Yellow");
        undoButton = new Button("Undo");

        JPanel receiver = this;

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        this.add(redButton);
        this.add(blueButton);
        this.add(yellowButton);
        this.add(undoButton);
    }
}
