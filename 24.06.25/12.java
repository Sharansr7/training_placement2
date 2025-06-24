import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AdmissionForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("College Form");
        JTextField name = new JTextField();
        JButton submit = new JButton("Submit");

        name.setBounds(100, 50, 200, 30);
        submit.setBounds(100, 100, 100, 30);

        f.add(new JLabel("Name:")).setBounds(30, 50, 50, 30);
        f.add(name); f.add(submit);
        f.setSize(400, 200); f.setLayout(null); f.setVisible(true);

        submit.addActionListener(e -> {
            try {
                FileWriter w = new FileWriter("admission.txt", true);
                w.write(name.getText() + "\n");
                w.close();
                JOptionPane.showMessageDialog(f, "Saved!");
            } catch (IOException ex) { ex.printStackTrace(); }
        });
    }
}
