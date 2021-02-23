import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohortWithNone;
    Cohort cohortWithSome;
    Cohort cohortWithABunch;


    @Test
    public void testIfAddStudentWorks() {
        cohortWithABunch.addStudent(new Student(3, "John Gamboa"));
        assertEquals("John Gamboa", cohortWithABunch.getStudents().get(2).getName());
        cohortWithABunch.addStudent(new Student(4, "Ted McCormick"));
        assertEquals("Ted McCormick", cohortWithABunch.getStudents().get(3).getName());
        cohortWithABunch.addStudent(new Student(5, "Jimmie McBride"));
        assertEquals("Jimmie McBride", cohortWithABunch.getStudents().get(4).getName());
        cohortWithABunch.addStudent(new Student(6, "Ronald Rajski"));
        assertEquals("Ronald Rajski", cohortWithABunch.getStudents().get(5).getName());
        assertEquals(6, cohortWithABunch.getStudents().size());
    }

}
