package util;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public int getInt() {
        return scanner.nextInt();
    }
}
