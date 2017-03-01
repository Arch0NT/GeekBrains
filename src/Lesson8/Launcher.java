package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Launcher extends JFrame implements Runnable {

    public void run() {
        JFrame stage = new JFrame("XO Swing");
        stage.setSize(300, 300);
        stage.setResizable(false);
        stage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New Game");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));

        menu.add(newMenuItem);
        menu.addSeparator();
        menu.add(exitMenuItem);
        menuBar.add(menu);
        stage.setJMenuBar(menuBar);
        stage.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++) {
            stage.add(new JButton(""+(i+1)).addActionListener(e -> ));
        }

        stage.setVisible(true);
    }
}
