package java1217;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTHandler implements ActionListener {
    JButton[] cells;
    boolean turn;
    TTTModel model;

    public TTTHandler(JButton[] _cells) {
        cells = _cells;
        turn = true;
        model = new TTTModel(_cells);
    }

    public void actionPerformed(ActionEvent event) {
        JButton clickedCell = (JButton) event.getSource();
        for (int i = 0; i < TTTBoard.NUMBER_CELLS; i++) {
            if (cells[i] == clickedCell) {
                if (model.setCell(i, turn)) {
                    turn = !turn;
                }
                break;
            }
        }
        int result = model.getGameCondition();
        switch (result) {
            case 0:
                System.out.println("O wins!");
                break;
            case 1:
                System.out.println("X wins!");
                break;
            case 3:
                System.out.println("Game is Tied!");
                break;
        }
    }
}
