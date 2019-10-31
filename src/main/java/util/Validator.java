package util;

public class Validator {

    public boolean isNumber(String str) {
        return str.matches("\\d+");
    }

    public int getInt(String str) {
        return Integer.parseInt(noTub(str));
    }

    public String noTub(String str) {
        return str.replaceAll("\\s+", "");
    }
}
