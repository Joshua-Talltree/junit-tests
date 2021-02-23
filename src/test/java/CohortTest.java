import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohortWithNone;
    Cohort cohortWithSome;
    Cohort cohortWithABunch;

    // 4. Code refactored
    @Before
    public void initialSetup() {
        cohortWithNone = new Cohort();
        cohortWithSome = new Cohort();
        cohortWithABunch = new Cohort();

        Student john = new Student(1L, "John Gamboa");
        john.addGrade(82);

        Student ted = new Student(2L, "Ted McCormick");
        ted.addGrade(59);
        ted.addGrade(89);
        ted.addGrade(93);

        cohortWithSome.addStudent(john);
        cohortWithABunch.addStudent(john);
        cohortWithABunch.addStudent(ted);
    }


    // 1. Test to see if I can add a student
    @Test
    public void testIfICanAddStudents() {
        cohortWithABunch.addStudent(new Student(3L, "John Gamboa"));
        assertEquals("John Gamboa", cohortWithABunch.getStudents().get(2).getName());
        cohortWithABunch.addStudent(new Student(4L, "Ted McCormick"));
        assertEquals("Ted McCormick", cohortWithABunch.getStudents().get(3).getName());
        cohortWithABunch.addStudent(new Student(5L, "Jimmie McBride"));
        assertEquals("Jimmie McBride", cohortWithABunch.getStudents().get(4).getName());
        cohortWithABunch.addStudent(new Student(6L, "Ronald Rajski"));
        assertEquals("Ronald Rajski", cohortWithABunch.getStudents().get(5).getName());
        assertEquals(6, cohortWithABunch.getStudents().size());
    }

    // 2. Test to see if I can retrieve the current student list
    @Test
    public void testToSeeIfICanRetrieveCurrentStudentList() {
        assertEquals(0, cohortWithNone.getStudents().size());
        assertEquals(1, cohortWithSome.getStudents().size());
        assertEquals(1, cohortWithABunch.getStudents().get(0).getId());
        assertEquals(2, cohortWithABunch.getStudents().get(1).getId());
    }

    // 3. Test to see if grades are averaged
    @Test
    public void testToSeeIfGradesAreAveraged() {
        assertEquals(0, cohortWithNone.getCohortAverage(), 0);
        assertEquals(82, cohortWithSome.getCohortAverage(), 0);
        assertEquals(81.16666666666666, cohortWithABunch.getCohortAverage(), 0);
    }
}
