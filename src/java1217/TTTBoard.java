package java1217;

import javax.swing.*;
import java.awt.*;

public class TTTBoard extends JFrame {
    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 330;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    static final int NUMBER_CELLS = 9;

    JButton[] cells = new JButton[9]; // 九個按鈕
    TTTHandler handler;

    public TTTBoard() {
        super("Tic-Tac-Toe");

        //set the frame properties
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(true);
        //this.setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        this.setLocation(100, 100);

        Container contentPane = getContentPane();
        //contentPane.setLayout(new FlowLayout());
        contentPane.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < NUMBER_CELLS; i++) {
            cells[i] = new JButton();
            this.add(cells[i]); // 一個一個加入按鈕
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        handler = new TTTHandler(cells);
        for (int i = 0; i < NUMBER_CELLS; i++) {
            cells[i].addActionListener(handler);
        }
    }

    public void init() {
        this.setVisible(true);
    }
}
