import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    @Test
    public void testAsRomanNumbersUnits() {
        String roman;
        roman = Roman.asRomanNumber(1);
        assertEquals("I", roman);

        roman = Roman.asRomanNumber(2);
        assertEquals("II", roman);

        roman = Roman.asRomanNumber(3);
        assertEquals("III", roman);

        roman = Roman.asRomanNumber(4);
        assertEquals("IV", roman);

        roman = Roman.asRomanNumber(5);
        assertEquals("V", roman);

        roman = Roman.asRomanNumber(6);
        assertEquals("VI", roman);

        roman = Roman.asRomanNumber(7);
        assertEquals("VII", roman);

        roman = Roman.asRomanNumber(8);
        assertEquals("VIII", roman);

        roman = Roman.asRomanNumber(9);
        assertEquals("IX", roman);
    }

    @Test
    public void testAsRomanNumbersTenths() {
        String roman;
        roman = Roman.asRomanNumber(10);
        assertEquals("X", roman);

        roman = Roman.asRomanNumber(20);
        assertEquals("XX", roman);

        roman = Roman.asRomanNumber(30);
        assertEquals("XXX", roman);

        roman = Roman.asRomanNumber(40);
        assertEquals("XL", roman);

        roman = Roman.asRomanNumber(50);
        assertEquals("L", roman);

        roman = Roman.asRomanNumber(60);
        assertEquals("LX", roman);

        roman = Roman.asRomanNumber(70);
        assertEquals("LXX", roman);

        roman = Roman.asRomanNumber(80);
        assertEquals("LXXX", roman);

        roman = Roman.asRomanNumber(90);
        assertEquals("XC", roman);
    }

    @Test
    public void testAsRomanNumbersCents() {
        String roman;
        roman = Roman.asRomanNumber(100);
        assertEquals("C", roman);

        roman = Roman.asRomanNumber(200);
        assertEquals("CC", roman);

        roman = Roman.asRomanNumber(300);
        assertEquals("CCC", roman);

        roman = Roman.asRomanNumber(400);
        assertEquals("CD", roman);

        roman = Roman.asRomanNumber(500);
        assertEquals("D", roman);

        roman = Roman.asRomanNumber(600);
        assertEquals("DC", roman);

        roman = Roman.asRomanNumber(700);
        assertEquals("DCC", roman);

        roman = Roman.asRomanNumber(800);
        assertEquals("DCCC", roman);

        roman = Roman.asRomanNumber(900);
        assertEquals("CM", roman);
    }

    @Test
    public void testAsRomanNumbersThousands() {
        String roman;
        roman = Roman.asRomanNumber(1000);
        assertEquals("M", roman);

        roman = Roman.asRomanNumber(2000);
        assertEquals("MM", roman);
    }

    @Test
    public void testAsRomanNumbersMixed() {
        String roman;
        roman = Roman.asRomanNumber(41);
        assertEquals("XLI", roman);

        roman = Roman.asRomanNumber(91);
        assertEquals("XCI", roman);

        roman = Roman.asRomanNumber(901);
        assertEquals("CMI", roman);

        roman = Roman.asRomanNumber(846);
        assertEquals("DCCCXLVI", roman);

        roman = Roman.asRomanNumber(1999);
        assertEquals("MCMXCIX", roman);

        roman = Roman.asRomanNumber(2008);
        assertEquals("MMVIII", roman);
    }

/*
    @Test
    void testMOD()
    {
        for (int i = 0; i < 20; i++) {
            int quotient = i / 5;
            int remainder = i % 5;

            System.out.println(i + "-> " + quotient + " rest " + remainder);
        }

    }
*/

    @Test
    void test() {
        final int[] dividers = {1, 5, 10, 50, 100, 500, 1000};

        for (int i = 1; i <= 20; i++) {

            int num = i;

            for (int index = dividers.length - 1; index >= 0; index--) {
                int devider = dividers[index];

                if (devider <= num) {
                    int quotient = num / devider;
                    int remainder = num % devider;

                    System.out.println(num + " [devider: " + devider + ", quotient: " + quotient + ", remainder: " + remainder + "]");
                    num = remainder;


                }
            }
            System.out.println();

        }
    }
}
