package commands;

import editor.Editor;
import java.awt.Color;

public abstract class Command {
    public Editor editor;
    private Color backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.getBackground();
    }

    public void undo() {
        editor.setBackground(backup);
    }

    public abstract boolean execute();
}