import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoundTest {
    Round round = new Round(10);
    Round roundNull = null;
    Round roundRNegative = new Round(-10);


    @Test
    public void whenRadiusMinus10ThenObjectNull() //failed test, because haven`t radius validation
    {
        Assert.assertNull(roundRNegative);
    }

    @Test
    public void whenRoundNullThenNull() {

        Assert.assertNull(roundNull);
    }

    @Test(expected = Exception.class)// exception expected when function call to null
    public void whenObjectNullThenGetAreaException() {
        Assert.assertEquals(314.1, roundNull.getArea(), 0.1);
    }

    @Test
    public void whenRadius10ThenGetArea314And1() {
        Assert.assertEquals(314.1, round.getArea(), 0.1);
    }

    @Test
    public void whenRadius10AndA1RadianThenGetSectorArea50() {
        Assert.assertEquals(50, round.getSectorArea(1),0.01);
    }

    @Test
    public void whenRadius10ThenToStringExpected() {
        String expected = "Round{ R= 10.0}";
        Assert.assertEquals(expected,round.toString());
    }
}