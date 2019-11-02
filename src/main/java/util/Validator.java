package util;

public class Validator {

    public boolean isValid(String str) {
        if (isNumber(str)) {
            if (getInt(str) <= 0) {
                return false;
            } else
                return true;
        } else {
            return false;
        }
    }

    public int getInt(String str) {
        return Integer.parseInt(noTub(str));
    }

    public boolean isNumber(String str) {
        return noTub(str).matches("\\d+");
    }

    public String noTub(String str) {
        return str.replaceAll("\\s+", "");
    }
}
