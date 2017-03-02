package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Launcher extends JFrame {
    ImageIcon iconO = new ImageIcon("D:\\Java_workspace\\Lesson8\\src\\Lesson8\\o_cr.png");
    ImageIcon iconX = new ImageIcon("D:\\Java_workspace\\Lesson8\\src\\Lesson8\\x_cr.png");
    ArrayList<JButton> buttons = new ArrayList<>();
    final int O = -1;
    final int X = -7;
    int[][] weightField = {
            {3, 2, 3},
            {2, 4, 2},
            {3, 2, 3}
    };

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
        JPanel panel = new JPanel(new GridLayout(3, 3));
        stage.add(panel);
        panel.setDoubleBuffered(true);
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            panel.add(button);
            buttons.add(button);
            button.addActionListener(new ButtonPressed(i));
        }

        stage.setVisible(true);
    }

    class ButtonPressed implements ActionListener {
        private int number;

        public ButtonPressed(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isEmpty(number)) {
                buttons.get(number).setIcon(iconX);
                weightField[number % 3][number / 3] = -1;
                if (!isWin(X)) {
                    turnAI();
                } else {
                    trueWinner(X);
                }
            }
        }
    }

    void turnAI() {
        int number = findMaxWeight();
        System.out.println("Ход AI");
        buttons.get(number).setIcon(iconO);
        weightField[number % 3][number / 3] = -1;
        if (isWin(O)) trueWinner(O);
        weightUpLift(number);
    }

    boolean isEmpty(int number) {
        return (weightField[number % 3][number / 3] != O) && (weightField[number % 3][number / 3] != X);
    }

    boolean isWin(int XO) {
        int countIJ = 0;
        int countJI = 0;
        for (int i = 0; i < 3; i++) {
            int countJ = 0;
            int countI = 0;
            for (int j = 0; j < 3; j++) {
                if (weightField[i][j] == XO) countJ++;
                if (weightField[j][i] == XO) countI++;
                if ((weightField[i][j] == XO)&&(i==j)) countIJ++;
                if ((weightField[i][j] == XO)&&((i+j)==2)) countJI++;
            }
            if (countJ == 3) return true;
            if (countIJ == 3) return true;
            if (countJI == 3) return true;
            if (countI == 3) return true;
        }
        return false;
    }

    void trueWinner(int XO) {
        System.out.println("Winner is " + ((XO==X)? "Человек":"Компьютер"));
    }

    int findMaxWeight() {
        int max = 0;
        int index = 0;
        for (int number = 0; number < 9; number++)
            if (weightField[number % 3][number / 3] > max) {
                max = weightField[number % 3][number / 3];
                index = number;
            }
        return index;
    }

    void weightUpLift (int number){
        switch (number){
            case 0:
                for (int i : new int [] {1,2,3,4,6,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 1:
                for (int i : new int [] {0,2,4,7}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 2:
                for (int i : new int [] {1,0,5,4,6,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 3:
                for (int i : new int [] {0,6,4,5}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 4:
                for (int i : new int [] {0,1,2,3,5,6,7,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 5:
                for (int i : new int [] {2,3,4,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 6:
                for (int i : new int [] {0,3,2,4,7,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 7:
                for (int i : new int [] {1,4,6,8}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
            case 8:
                for (int i : new int [] {0,2,5,4,6,7}) if (isEmpty(i)) ++weightField[i % 3][i / 3];
                break;
        }
    }
}