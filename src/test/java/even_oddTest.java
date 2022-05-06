import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class even_oddTest {

    even_odd mainObject = new even_odd();

    @Nested

    class  positive {

        @Test
        public void zero() {
            assertEquals(mainObject.evenOdd(0),"The number is EVEN");
        }
        @Test
        public void one() {
            assertEquals(mainObject.evenOdd(1),"The number is ODD");
        }
        @Test
        public void TWENTYFOUR() {
            assertEquals(mainObject.evenOdd(24),"The number is EVEN");
        }
        @Test
        public void eleven() {
            assertEquals(mainObject.evenOdd(-11),"The number is EVEN");
        }

    }

}