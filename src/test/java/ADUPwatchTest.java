import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
class ADUPwatchTest {
    watch mainObject;
    @BeforeEach
    public void setup(){
        mainObject = new watch();
    }
    @Test
    public void ADUPtest1(){
        String[] res = mainObject.func('c');
        assertEquals("UPDATE", res[0]);
        assertEquals("min", res[1]);
        assertEquals("2000-1-1", res[2]);
        assertEquals("0:0", res[3]);
    }
    @Test
    public void ADUPtest2(){ mainObject.func('c');
        String[] res = mainObject.func('b');
        assertEquals("UPDATE", res[0]);
        assertEquals("min", res[1]);
        assertEquals("2000-1-1", res[2]);
        assertEquals("0:1", res[3]);
    }
    @Test
    public void ADUPtest3(){ mainObject.func('c'); mainObject.func('b');
        String[] res = mainObject.func('b');
        assertEquals("UPDATE", res[0]);
        assertEquals("min", res[1]);
        assertEquals("2000-1-1", res[2]);
        assertEquals("0:2", res[3]);
    }
    @Test
    public void ADUPtest4(){
        mainObject.func('c');
        mainObject.func('b');
        mainObject.func('b');
        String[] res = mainObject.func('a');
        assertEquals("UPDATE", res[0]);
        assertEquals("hour", res[1]);
        assertEquals("2000-1-1", res[2]);
        assertEquals("0:2", res[3]);
    }

    @Test
    public void ADUPtest5(){
        mainObject.func('c');
        mainObject.func('b');
        mainObject.func('b');
        mainObject.func('a');
        mainObject.func('b');
        mainObject.func('b');
        mainObject.func('a');
        mainObject.func('b');
        mainObject.func('b');
        String[] res = mainObject.func('a');
        assertEquals("UPDATE", res[0]);
        assertEquals("month", res[1]);
        assertEquals("2000-1-3", res[2]);
        assertEquals("2:2", res[3]);
    }
}