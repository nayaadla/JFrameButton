
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Me Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Welcome to the Click Me App!", SwingConstants.CENTER);
        label.setFont(new Font("Verdana", Font.PLAIN, 18));
        frame.add(label, BorderLayout.NORTH);

        JButton button = new JButton("Click Me");
        button.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(button, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Go Hatters!");
            }
        });

        frame.setVisible(true);
    }
}
