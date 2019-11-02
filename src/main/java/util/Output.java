package util;

public class Output {

    public void chessBoardInstruction(String side) {
        System.out.println("Enter " + side + " of a board");
    }

    public void printChessBoard(StringBuilder line) {
        System.out.println(line);
    }

    public void wrongData() {
        System.out.println("Not valid data");
    }
}
