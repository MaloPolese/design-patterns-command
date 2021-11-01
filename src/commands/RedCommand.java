package commands;

import java.awt.Color;

import editor.Editor;

public class RedCommand extends Command {

    public RedCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        editor.setBackground(Color.RED);
        return true;
    }
}