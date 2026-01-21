package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testStructure_NullOrEmptyInput() {
        assertEquals(0, analyzer.countExcellentStudents(null));
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    @Test
    public void testPartition_InvalidValues_Ignored() {
        List<Double> dirtyData = Arrays.asList(
                -0.0001,
                10.0001,
                Double.NaN,
                Double.POSITIVE_INFINITY,
                Double.NEGATIVE_INFINITY,
                null);

        assertEquals(0, analyzer.countExcellentStudents(dirtyData));
        assertEquals(0.0, analyzer.calculateValidAverage(dirtyData), 0.01);
    }

    @Test
    public void testPartition_ValidAndBoundaries() {
        List<Double> scores = Arrays.asList(0.0, 7.99, 8.0, 10.0);

        assertEquals(2, analyzer.countExcellentStudents(scores));
        assertEquals(6.4975, analyzer.calculateValidAverage(scores), 0.0001);
    }

    @Test
    public void testScenario_MixedRealWorld() {
        List<Double> scores = Arrays.asList(9.0, null, 5.0, Double.NaN, -1.0);

        assertEquals(1, analyzer.countExcellentStudents(scores));
        assertEquals(7.0, analyzer.calculateValidAverage(scores), 0.01);
    }
}