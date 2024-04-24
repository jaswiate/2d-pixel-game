package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame window = new JFrame();
    public static void main(String[] args) {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();
//        HUDPanel HUD = new HUDPanel(gamePanel);
        window.add(gamePanel, BorderLayout.SOUTH);
//        window.add(HUD, BorderLayout.NORTH);

        window.pack();
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
