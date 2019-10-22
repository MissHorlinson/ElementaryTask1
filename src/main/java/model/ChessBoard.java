package model;

public class ChessBoard {
    private int height;
    private int width;

    public ChessBoard() { }

    public ChessBoard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() { return this.height; }

    public  int getWidth() { return this.width; }

    public void setHeight(int height) { this.height = height; }

    public void setWidth(int width) { this.width = width; }
}
