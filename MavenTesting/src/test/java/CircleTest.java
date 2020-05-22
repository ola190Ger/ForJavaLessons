import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle = new Circle(10);
    @Test
    public void whenRadius10ThenDiameter20() {
        Assert.assertEquals(20, circle.getDiameter(),0.01);
    }

    @Test
    public void whenRadius10ThenGetCircumference62And8() {
        Assert.assertEquals(62.8, circle.getCircumference(), 0.1);
    }

    @Test
    public void whenRadius10AndA1ThenGetChordLength() {
        Assert.assertEquals(9.58, circle.getChordLength(1),0.1);
    }

    @Test
    public void whenRadius10AndA1radianThenGetArcLength10() {
        Assert.assertEquals(10, circle.getArcLength(1), 0.01);
    }

    @Test
    public void whenRadius10AndA1radianThenGetSegmentArea7And92() {
        Assert.assertEquals(7.92, circle.getSegmentArea(1), 0.01);
    }

    @Test
    public void whenRadius10AndA1radianThenGetSegmentHeight1And22() {
        Assert.assertEquals(1.22, circle.getSegmentHeight(1), 0.01);
    }

    @Test
    public void whenRadius10ThenToStringExpected() {
        String expected = "Circle{R= 10.0}";
        Assert.assertEquals(expected,circle.toString());
    }
}