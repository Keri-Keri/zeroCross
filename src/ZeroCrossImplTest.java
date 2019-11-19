import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroCrossImplTest {

    @Test
    public void isWinerZero() {
        int[][] preparedArrayForIsWinnerZero = {
                {4, 4, 4},
                {0, 0, 0},
                {0, 0, 0}
        };

        ZeroCrossImpl  zeroCross = new ZeroCrossImpl();
        zeroCross.firstPlayer = 4;

        assertEquals(true, zeroCross.IsWinerZero(preparedArrayForIsWinnerZero));
    }


    @Test
    public void isWinerCross(){
        int [][] preparedArrayForIsWinnerCross = {
                {0,7,0},
                {0,7,0},
                {0,7,0}

        };
        ZeroCrossImpl zeroCross = new ZeroCrossImpl();
        zeroCross.secondPlayer = 7;
        assertEquals(true,zeroCross.IsWinerCross(preparedArrayForIsWinnerCross));

    }
    @Test
    public void isStendoff () {
        int [][] preparedArrayForIsStendoff = {

                {4,7,4},
                {7,4,4},
                {7,4,7}

        };
        ZeroCrossImpl zeroCross = new ZeroCrossImpl();
        zeroCross.firstPlayer = 4;
        zeroCross.secondPlayer = 7;
        assertEquals(true,zeroCross.IsStendoff(preparedArrayForIsStendoff));

    }
    @Test
    public void whoNext () {

    }




}
