package commands;

import java.awt.Color;

import editor.Editor;

public class BlueCommand extends Command {

    public BlueCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.setBackground(Color.BLUE);
        return false;
    }
}