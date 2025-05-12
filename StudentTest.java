import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testGetFullNameWithFirstMiddleLastName() {
        Student student = new Student("John Michael Doe");
        assertEquals("John Michael Doe", student.getFullName());
    }

    @Test
    public void testGetFullNameWithFirstAndLastName() {
        Student student = new Student("Jane Doe");
        assertEquals("Jane Doe", student.getFullName());
    }

    @Test
    public void testGetFullNameWithOnlyFirstName() {
        Student student = new Student("Alice");
        assertEquals("Alice", student.getFullName());
    }

    @Test
    public void testGetFullNameWithExtraSpaces() {
        Student student = new Student("   Bob   Charles   Smith   ");
        assertEquals("Bob Charles Smith", student.getFullName());
    }

    @Test
    public void testGetFullNameWithEmptyString() {
        Student student = new Student("");
        assertEquals("", student.getFullName());
    }
}