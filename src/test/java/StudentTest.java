import org.junit.Test;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfIdIsValid() {
        assertEquals(4, 4);
    }

    @Test
    public void testIfCorrectName() {
        assertTrue("James", true);
        assertFalse("Jimmie", false);
    }

    @Test
    public void  testIfGradeIsCorrect() {
        assertEquals(85, 87);
    }

    @Test
    public void testIfGradeIsAveraged() {
        assertEquals(88, 88.5, 0.5);
    }
}
