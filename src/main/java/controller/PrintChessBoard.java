package controller;

import model.ChessBoard;
import service.BoardService;
import util.*;

public class PrintChessBoard {
    private Input        input = new Input();
    private Output       output = new Output();
    private BoardService service = new BoardService();
    private Validator    validator = new Validator();
    private ChessBoard   board;

    public void createBoard() {
        board = new ChessBoard(chessBoard("height"), chessBoard("width"));
        boardToScreen(board);
    }

    public void boardToScreen(ChessBoard board) {
        for(int i = 0; i < board.getHeight(); i++) {
            for(int j = 0; j < board.getWidth(); j++) {
                if(service.symbolPrint(i, j)) {
                    output.printStar();
                } else {
                    output.printSpace();
                }
            }
            output.newLine();
        }
    }

    public int chessBoard(String side) {
        int sideValue = 0;
        output.chessBoardInstruction(side);
        while(sideValue <= 0) {
            output.negativeNumber();
            String value = input.getString();
            if(validator.isNumber(value)) {
                sideValue = validator.getInt(value);
            }
        }
        return sideValue;
    }
}
