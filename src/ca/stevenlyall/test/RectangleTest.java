package ca.stevenlyall.test;

import ca.stevenlyall.app.Rectangle;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class RectangleTest {

    Rectangle rectangle;

    @Test
    public void testGetPerimeterCalculatesPerimeterCorrectly() {
        rectangle = new Rectangle(2,4);

        int perimeter = rectangle.getPerimeter();
        assertEquals(12, perimeter);
    }

}
