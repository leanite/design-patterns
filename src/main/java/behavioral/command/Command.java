package behavioral.command;

public abstract class Command {
    protected Editor editor;
    private String backupText;

    Command(Editor editor) {
        this.editor = editor;
    }

    protected void backupText() {
        backupText = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backupText);
    }

    public abstract boolean execute();
}