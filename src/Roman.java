public final class Roman {
    final static String[] letter = {"I", "V", "X", "L", "C", "D", "M"};

    public static String asRomanNumber(int num) {
        assert num > 0;
        String romanNum = "";

        int quotient = num / 5;
        int remainder = num % 5;

        if (quotient == 0) {
            if (remainder > 3) {
                romanNum += letter[0] + letter[quotient + 1];
            }
            else {
                romanNum += addIII(letter[0], remainder);
            }
        }
        else {
            if (quotient == 1) {
                if (remainder > 3) {
                    romanNum += letter[0] + letter[quotient + 1];
                }
                else {
                    romanNum += letter[quotient];
                    romanNum += addIII(letter[0], remainder);
                }
            }
        }

//        if (num <= 3) {
//            romanNum = addIII(num);
//        }
//        else {
//            if (num < 5) {
//                romanNum = "IV";
//            }
//            else {
//                if (num <= 8) {
//                    romanNum = "V";
//
//                    if (num > 5) {
//                        romanNum += addIII(num - 5);
//                    }
//                }
//                else {
//                    romanNum = "IX";
//                }
//            }
//        }

        return romanNum;
    }

    private static String addIII(String letter, int numI) {
        return letter.repeat(Math.max(0, numI));
    }
}
