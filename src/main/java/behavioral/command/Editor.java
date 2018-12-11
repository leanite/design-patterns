package behavioral.command;

import javax.swing.*;
import java.awt.*;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel content = new JPanel();

        setupFrame(frame);
        setupMainLayout(content);
        initButtons(content);

        frame.setContentPane(content);
    }

    private void setupFrame(JFrame frame) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void setupMainLayout(JPanel content) {
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
    }

    private void initButtons(JPanel content) {
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(this)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(this)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(this)));
        ctrlZ.addActionListener(e -> undo());

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
