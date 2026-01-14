import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();



    @Test
    public void testCountExcellentStudents_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0, 5.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllExcellent() {
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.5, 10.0)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }
    
    @Test
    public void testCountExcellentStudents_NullList() {
        assertEquals(0, analyzer.countExcellentStudents(null));
    }


    @Test
    public void testCalculateValidAverage_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.0, -5.0, 15.0);
        assertEquals(8.5, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_NoValidScores() {
        List<Double> scores = Arrays.asList(-1.0, 20.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01);
    }
}