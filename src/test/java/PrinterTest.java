import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void testPrint() {
        printer.print(2, 3);
        assertEquals(14, printer.getPaper());
    }

    @Test
    public void testCannotPrint() {
        printer.print(10, 5);
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void testCanPrint() {
        printer.print(3, 5);
        assertEquals(5, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void reduceToner() {
        printer.print(3, 5);
        assertEquals(85, printer.getToner());
    }

}
