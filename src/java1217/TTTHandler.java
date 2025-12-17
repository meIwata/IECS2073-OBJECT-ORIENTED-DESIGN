package java1217;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTHandler implements ActionListener {
    JButton[] cells;
    boolean turn;

    public TTTHandler(JButton[] _cells) {
        cells = _cells;
        turn = true;
    }

    public void actionPerformed(ActionEvent event) {
        JButton clickedCell = (JButton) event.getSource();
        for (int i = 0; i < TTTBoard.NUMBER_CELLS; i++) {
            if (cells[i] == clickedCell) {
                if (turn) {
                    cells[i].setLabel("O");
                } else {
                    cells[i].setLabel("X");
                }
                cells[i].setEnabled(false);
                turn = !turn;
                break;
            }
        }
    }
}
