import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class watchTest {

    @Nested
    class EdgeCoverage {
        watch mainObject;

        @BeforeEach
        public void setup() {
            mainObject = new watch();
        }

        @Test
        public void ECtest1() {
            String[] res = mainObject.func('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ECtest2() {
            mainObject.func('a');
            String[] res = mainObject.func('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ECtest3() {
            mainObject.func('a');
            mainObject.func('a');
            String[] res = mainObject.func('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ECtest4() {
            mainObject.func('a');
            mainObject.func('a');
            mainObject.func('c');
            String[] res = mainObject.func('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void ECtest5() {
            mainObject.func('a');
            mainObject.func('a');
            mainObject.func('c');
            mainObject.func('b');
            String[] res = mainObject.func('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void ECtest6() {
            mainObject.func('a');
            mainObject.func('a');
            mainObject.func('c');
            mainObject.func('b');
            mainObject.func('a');
            String[] res = mainObject.func('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void ECtest7() {
            mainObject.func('a');
            mainObject.func('a');
            mainObject.func('c');
            mainObject.func('b');
            mainObject.func('a');
            mainObject.func('b');
            String[] res = mainObject.func('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void ECtest8(){
            mainObject.func('a');
            mainObject.func('a');
            mainObject.func('c');
            mainObject.func('b');
            mainObject.func('a');
            mainObject.func('b');
            mainObject.func('a');
            mainObject.func('b');
            mainObject.func('a');
            mainObject.func('b'); mainObject.func('a'); mainObject.func('b');
            String[] res = mainObject.func('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
    }
}