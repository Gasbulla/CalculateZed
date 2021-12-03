public class Oper {

    public static int calc(int one, int two, String oper) throws Exception {

        int result = 0;
        if (one > 0 && one < 11 && two > 0 && two < 11 ) {

            switch (oper) {
                case "+":
                    result = one + two;
                    break;
                case "-":
                    result = one - two;
                    break;
                case "*":
                    result = one * two;
                    break;
                case "/":
                    result = one / two;
                    break;
                default:
                    throw new Exception("Error operand!");
            }
        } else {
            throw new Exception("Error 11 > num < 0!");
        }
        return result;
    }
}
