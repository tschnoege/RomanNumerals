import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    @Test
    public void testAsRomanNumbers (){
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

        roman = Roman.asRomanNumber(10);
        assertEquals("X", roman);
    }

}
