package cc.xpbootcamp.code_smell_kit.$13_loops;

public class GameOfLife {
    public Cell[][] initCellMatrixTest(Cell[][] cellMatrix) {
        for (int i = 1; i < cellMatrix.length - 1; i++) {
            for (int j = 1; j < cellMatrix[0].length - 1; j++) {
                if (i == 1 && j == 2 || i == 1 && j == 3 || i == 2 && j == 3) {
                    cellMatrix[i][j].setCurState(true);
                }
            }
        }
        return cellMatrix;
    }
}
