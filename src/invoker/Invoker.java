package invoker;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import commands.BlueCommand;
import commands.Command;
import commands.CommandHistory;
import commands.RedCommand;
import commands.YellowCommand;
import gui.Button;

public class Invoker extends JPanel {
    public String clipboard;
    private CommandHistory history = new CommandHistory();
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
                executeCommand(new RedCommand(receiver));
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new BlueCommand(receiver));
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new YellowCommand(receiver));
            }
        });
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        this.add(redButton);
        this.add(blueButton);
        this.add(yellowButton);
        this.add(undoButton);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty())
            return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
