import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3,4);
    @org.junit.Test
    public void whenWidth3AndLength4ThenGetArea12() {
        Assert.assertEquals(12, rectangle.getArea());
    }

    @Test
    public void whenWidth3AndLength4ThenGetPerimeter14() {
        Assert.assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    public void whenWidth3AndLength4ThenGetDiagonal5() {
        Assert.assertEquals(5, rectangle.getDiagonal(), 0.01);
    }

    @Test
    public void whenWidth4AndLength3ThenIsSquareFalse() {
        Assert.assertFalse(rectangle.isSquare());
    }

    @Test
    public void whenWidthEqualsLengthThenIsSquareTrue() {
        rectangle.setLength(rectangle.getWidths());
        Assert.assertTrue(rectangle.isSquare());
    }
}