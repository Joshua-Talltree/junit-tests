import org.junit.Test;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testPossibilityOfStudentCreation() {
        Student Josh = new Student(1L, "Josh");
        Student Jimmie = new Student(2L, "Jimmie");
        assertNotNull(Josh);
        assertNotNull(Jimmie);
    }

    @Test
    public void testStudentInfo() {
        Student Josh = new Student(1L, "josh");
        assertEquals(1, Josh.getId());
        assertEquals("josh", Josh.getName());
        assertNotNull(Josh.getGrades());
    }

    @Test
    public void testIfCorrectName() {
        Student Jimmie = new Student(2L, "Jimmie");
        assertTrue("James", true);
        assertFalse("Jimmie", false);
    }

    @Test
    public void testIfICanAddAGrade(){
        Student Jimmie = new Student(2L, "Jimmie");
        assertEquals(0, Jimmie.getGrades().size());
        Jimmie.addGrade(83);
        assertEquals(83, (int) Jimmie.getGrades().get(0));
    }

    @Test
    public void  testIfGradeIsCorrect() {

    }

    @Test
    public void testIfGradeIsAveraged() {
        Student Josh = new Student(1L, "Josh");
        Josh.addGrade(82);
        Josh.addGrade(99);
        assertEquals(90, Josh.getGradeAverages(), 0.5);
    }
}
