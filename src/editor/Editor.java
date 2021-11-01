package editor;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import commands.BlueCommand;
import commands.Command;
import commands.CommandHistory;
import commands.RedCommand;
import commands.YellowCommand;
import gui.Button;

public class Editor extends JPanel {
    public String clipboard;
    private Button undoButton;
    private CommandHistory history = new CommandHistory();

    public Editor() {
        Button redButton = new Button("Red");
        Button blueButton = new Button("Blue");
        Button yellowButton = new Button("Yellow");
        undoButton = new Button("Undo");
        undoButton.setEnabled(false);

        Editor editor = this;

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new RedCommand(editor));
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new BlueCommand(editor));
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new YellowCommand(editor));
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
            undoButton.setEnabled(true);
        }
    }

    private void undo() {
        if (history.isEmpty())
            return;

        Command command = history.pop();
        if (history.isEmpty()) {
            undoButton.setEnabled(false);
        }
        if (command != null) {
            command.undo();
        }
    }
}
