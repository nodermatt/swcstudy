package ch.fhnw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addCourseGrade() {
        Student celine = new Student("Celine", "Albreche");
        // a.) Valid values
        double grade = 6.0;
        String courseId = "BSL18H";

        celine.addCourseGrade(courseId, grade);
        // b.) Correct grade
        //c.) check delta
        assertEquals(grade, celine.getGrade(courseId), 0.0001);
        // course was saved
        assertEquals(courseId, celine.getCourses()[0]);
        assertEquals(1,celine.getNumOfCourses());

        // d.) Course overwritten
        // e.) course count still 1
        celine.addCourseGrade(courseId, 5.0);
        assertEquals(5.0, celine.getGrade(courseId), 0.0001);
        assertEquals(1,celine.getNumOfCourses());
    }

    @Test
    public void testAddCourseGradeException() {
        Student celine = new Student("Celine", "Albreche");
        // a.) upper bound fail value
        double upperBound = 6.1;
        // b.) lower bound fail value
        double lowerBound = 0.9;
        String courseId = "BSL18H";

        // c.) check for expected exception for both values, fail if none is thrown
        try {
            celine.addCourseGrade(courseId, upperBound);
            fail();
        } catch (IllegalArgumentException iae) {}
        try {
            celine.addCourseGrade(courseId, lowerBound);
            fail();
        } catch (IllegalArgumentException iae) {}
    }

    @Test
    public void testAddCourseGradeArrayEncapsulation() {
        Student celine = new Student("Celine", "Albreche");
        // a.) Valid values
        double grade = 6.0;
        String courseId = "BSL18H";
        // Kapselung = Es ist möglich den Inhalt von Grades von aussen zu verändern
        // Solution: Gebe Kopie des Arrays zurueck, s.h AB JUnit
        celine.addCourseGrade("BSL18H", 5.0);
        celine.addCourseGrade("ZRH19F", 6.0);
        celine.addCourseGrade("LAX20H", 1.0);
        celine.addCourseGrade("BER18H", 4.5);

        // a.) try to manipulate the grade of a course
        celine.getGrades()[0] = 6.0;
        // b.) Assert that the value remains unchanged
        assertEquals(5.0, celine.getGrades()[0], 0.0001);
    }

    @Test
    public void testAddCourseGradeMaxCourses() {
        Student celine = new Student("Celine", "Albreche");
        double grade = 6.0;
        String courseId = "BSL18H";
        // a.) fill array with possible number of courses
        // trick: Start at 10 to have two digits for the valid courseId
        for (int i = 10; i < 39; i++) {
            celine.addCourseGrade("BSL" + i + "H", grade);
        }

        try {
            // b.) Add one more that causes error
            celine.addCourseGrade("BSL99H", grade);
            // d.) fail test if exception doesnt occur
            fail();
        } catch (ArrayIndexOutOfBoundsException aoob) {
            // c.) Compare error messages (Make sure its the AOOB that we expect)
            Assert.assertEquals("Max number of courses reached", aoob.getMessage());
        }
    }


}