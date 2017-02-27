package Lesson8;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Launcher extends JFrame implements Runnable {

    public void run() {
        JFrame stage = new JFrame("Крестики-нолики Swing");
        stage.setSize(400, 300);
        stage.setResizable(false);
        stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New Game");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.exit(0);
            }
        });

        menu.add(newMenuItem);
        menu.addSeparator();
        menu.add(exitMenuItem);
        menuBar.add(menu);
        stage.setJMenuBar(menuBar);

        stage.setVisible(true);
    }
}
