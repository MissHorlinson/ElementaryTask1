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
        board = new ChessBoard(boardSide("height"), boardSide("width"));
        boardToScreen(board);
    }

    public int boardSide(String side) {
        output.chessBoardInstruction(side);
        String sideValue = input.getString();
        while (!validator.isValid(sideValue)) {
            output.wrongData();
            sideValue = input.getString();
        }
        int value = validator.getInt(sideValue);
        return value;
    }

   public void boardToScreen(ChessBoard board) {
        for(int i = 0; i < board.getHeight(); i++) {
           output.printChessBoard(service.chessLine(board, i));
        }
    }
}
