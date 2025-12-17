package java1217;

import javax.swing.*;

public class TTTModel {
    int[] cellStatus = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    JButton[] cells;

    public TTTModel(JButton[] _cells) {
        cells = _cells;
    }

    public boolean setCell(int index, boolean turn) {
        boolean isSuccessSetting = false;
        if (cellStatus[index] == 0) {
            if (turn) {
                cells[index].setLabel("O");
                cellStatus[index] = 1;
            } else {
                cells[index].setLabel("X");
                cellStatus[index] = 2;
            }
            isSuccessSetting = true;
        }
        return (isSuccessSetting);
    }

    public int getGameCondition() {
        /*
        0: O win
        1: X win
        2: Tie
        3: Not yet finished
        */
        int result = 3;
        if ((cellStatus[0] == cellStatus[1]) & (cellStatus[1] == cellStatus[2])) {
            if (cellStatus[0] == 0) return 0;
            else if (cellStatus[0] == 1) return 1;
        }
        for (int i = 1; i <= 9; i++) {
            if (cellStatus[i] == 2) {
                return 2;
            }
        }
        return 3;
    }
}
