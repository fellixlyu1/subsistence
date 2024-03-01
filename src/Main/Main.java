package Main;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Subsistence");

        Panel panel = new Panel();
        window.add(panel);

        window.pack();

        panel.gameStart();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
