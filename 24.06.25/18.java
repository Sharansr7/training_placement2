import javax.swing.*;
import java.awt.event.*;
import java.time.*;

public class Clock {
    public static void main(String[] args) {
        JFrame f = new JFrame("Clock");
        JLabel timeLabel = new JLabel();
        timeLabel.setBounds(50, 50, 200, 30);
        f.add(timeLabel);
        f.setSize(300, 150); f.setLayout(null); f.setVisible(true);

        new Timer(1000, e -> timeLabel.setText(LocalTime.now().toString())).start();
    }
}
