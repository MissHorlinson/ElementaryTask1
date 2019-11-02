package service;
import model.ChessBoard;

public class BoardService {

    public StringBuilder chessLine(ChessBoard board, int i) {
        StringBuilder starLine = new StringBuilder();
        for (int j = 0; j < board.getWidth(); j++) {
                if ((j + i) % 2 == 0) {
                    starLine.append("*");
                } else {
                    starLine.append(" ");
                }
        }
        return starLine;
    }
}
