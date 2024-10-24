package lab4;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Lab5Tests {

    @Test
    void testIsRhombusValid() {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(1, 4);
        Point p4 = new Point(2, 2);
        Rhombus r = new Rhombus(p1, p2, p3, p4);
        assertTrue(r.isRhombus(), "It is a valid rhombus.");
    }

    @Test
    void testIsRhombusInvalid() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Rhombus r = new Rhombus(p1, p2, p3, p4);
        assertFalse(r.isRhombus(), "It is not a valid rhombus.");
    }

    @Test
    void testPerimeterValid() {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(1, 4);
        Point p4 = new Point(2, 2);
        Rhombus r = new Rhombus(p1, p2, p3, p4);
        double expectedPerimeter = 4 * p1.distance(p2);
        try {
            double actualPerimeter = r.perimeter();
            assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "Correct perimeter for Rhombus.");
        } catch (RhombusException e) {
            fail("There is an exception for this rhombus: " + e.getMessage());
        }
    }

    @Test
    void testPerimeterInvalid() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Rhombus r = new Rhombus(p1, p2, p3, p4);
        try {
            r.perimeter();
            fail("Not the true rhombus");
        } catch (RhombusException e) {
            assertEquals("The given rhombus is not a real rhombus, play more Genshin!", e.getMessage());
        }
    }

}
