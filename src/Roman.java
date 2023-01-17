public final class Roman {
    final static int[] dividers = {1, 5, 10, 50, 100, 500, 1000};
    final static String[] letters = {"I", "V", "X", "L", "C", "D", "M"};

    public static String asRomanNumber(int num) {
        assert num > 0;
        StringBuilder romanNum = new StringBuilder();

        for (int index = dividers.length - 1; index >= 0; index--) {
            int devider = dividers[index];

            if (devider <= num) {
                int quotient = num / devider;
                int remainder = num % devider;
                boolean power10 = index % 2 == 0;  // 1, 10, 100, 1000

                if (power10) {
                    romanNum.append(addUnits(index, quotient));
                }
                else {
                    romanNum.append(addTenths(index, quotient, remainder));
                    int x4 = 4 * dividers[index - 1];

                    if (remainder >= x4) {
                        num -= x4;
                    }
                }

                num -= quotient * devider;
            }
        }

        return romanNum.toString();
    }

    private static String addIII(String letter, int numI) {
        return letter.repeat(Math.max(0, numI));
    }

    private static String addUnits(int index, int quotient) {
        String result = "";

        if (quotient == 4) {
            result += letters[index];
            result += letters[index + 1];
        } else {
            result += addIII(letters[index], quotient);
        }

        return result;
    }

    private static String addTenths(int index, int quotient, int remainder) {
        String result = "";

        int iv = 4 * dividers[index - 1];

        if (remainder >= iv) {
            result += letters[index - 1];
            result += letters[index + 1];
        } else {
            result += addIII(letters[index], quotient);
        }

        return result;
    }
}
