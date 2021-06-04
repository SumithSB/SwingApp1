import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm {
    public FirstForm() {
        pressMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameLabel.setText("Hello " + nameField.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstForm");
        frame.setContentPane(new FirstForm().rootPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel rootPanel;
    private JButton pressMeButton;
    private JLabel enterNameLabel;
    private JTextField nameField;
    private JLabel nameLabel;
}
