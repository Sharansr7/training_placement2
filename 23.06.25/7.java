import javax.swing.*;
import java.awt.event.*;

public class StudentManager extends JFrame {
    JTextField nameField = new JTextField();
    JTextArea resultArea = new JTextArea();

    StudentManager() {
        setTitle("Student Manager");
        setSize(400, 300);
        setLayout(null);

        JLabel lbl = new JLabel("Name:");
        lbl.setBounds(20, 20, 100, 30);
        nameField.setBounds(100, 20, 150, 30);

        JButton btn = new JButton("Add Student");
        btn.setBounds(100, 60, 150, 30);
        resultArea.setBounds(20, 100, 340, 150);

        add(lbl); add(nameField); add(btn); add(resultArea);

        btn.addActionListener(e -> {
            String name = nameField.getText();
            resultArea.append("Student added: " + name + "\n");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentManager();
    }
}
