public class ResultRoman {

    public static String intRoman(int dok) throws Exception {

        if (dok < 1 || dok > 100)
            throw new Exception("Error! The answer cannot be negative.");
        StringBuilder kod = new StringBuilder();

        while (dok >= 100) {
            kod.append("C");
            dok -= 100;
        }
        while (dok >= 90) {
            kod.append("XC");
            dok -= 90;
        }
        while (dok >= 50) {
            kod.append("L");
            dok -= 50;
        }
        while (dok >= 40) {
            kod.append("XL");
            dok -= 40;
        }
        while (dok >= 10) {
            kod.append("X");
            dok -= 10;
        }
        while (dok >= 9) {
            kod.append("IX");
            dok -= 9;
        }
        while (dok >= 5) {
            kod.append("V");
            dok -= 5;
        }
        while (dok >= 4) {
            kod.append("IV");
            dok -= 4;
        }
        while (dok >= 1) {
            kod.append("I");
            dok -= 1;
        }
        return kod.toString();
    }
}