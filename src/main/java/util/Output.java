package util;

public class Output {

    public void chessBoardInstruction(String side) {
        System.out.println("Enter " + side + " of a board");
    }

    public void printStar() {
        System.out.print("*");
    }

    public void printSpace() {
        System.out.print(" ");
    }

    public void newLine() {
        System.out.println();
    }

    public void negativeNumber() {
        System.out.println("It should be positive number > 0");
    }
}
