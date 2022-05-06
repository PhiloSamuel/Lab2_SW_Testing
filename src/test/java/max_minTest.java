import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;


class max_minTest {

    max_min mainObj = new max_min();
  ArrayList<Integer> arr = new ArrayList<Integer>();

    @Nested
    class Maximum{
        @AfterEach
        public void after(){
            arr.clear();
        }
        @Test
        public void EMPTY(){ assertEquals(mainObj.getMax(arr), null);
        }
        @Test
        public void oneElement(){
            arr.add(-92);
            assertEquals(mainObj.getMax(arr),-92); }
        @Test
        public void manyElements(){
            for(int i = 1; i < 10000; i*=4){
                arr.add(i);
            }
            assertEquals(mainObj.getMax(arr), Collections.max(arr));
    @Nested
    class Minimum {
                @AfterEach
                public void after() {
                    arr.clear();
                }

                @Test
                public void EMPTY() {
                    assertEquals(mainObj.getMin(arr), null);
                }

                @Test
                public void ONEELEM() {
                    arr.add(-88);
                    assertEquals(mainObj.getMin(arr), -88);
                }
            }
        }
    }
}