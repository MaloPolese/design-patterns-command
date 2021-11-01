package commands;

import java.awt.Color;

import editor.Editor;

public class YellowCommand extends Command {

    public YellowCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        editor.setBackground(Color.YELLOW);
        return true;
    }
}