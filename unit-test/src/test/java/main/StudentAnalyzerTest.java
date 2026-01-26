package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Nested
    @DisplayName("Technique 1: Equivalence Partitioning (EP)")
    class EquivalencePartitioningTests {

        @Test
        @DisplayName("EP Class: Valid Scores (0 <= score <= 10)")
        void testValidScores() {
            List<Double> validScores = Arrays.asList(5.0, 8.5, 9.0);
            assertEquals(2, analyzer.countExcellentStudents(validScores));
            assertEquals(7.5, analyzer.calculateValidAverage(validScores), 0.001);
        }

        @Test
        @DisplayName("EP Class: Invalid Scores (< 0, > 10, NaN, Infinity)")
        void testInvalidScores() {
            List<Double> invalidScores = Arrays.asList(-1.0, 11.0, Double.NaN, Double.POSITIVE_INFINITY);
            assertEquals(0, analyzer.countExcellentStudents(invalidScores));
            assertEquals(0.0, analyzer.calculateValidAverage(invalidScores), 0.001);
        }

        @Test
        @DisplayName("EP Class: Null or Empty List")
        void testNullOrEmpty() {
            assertEquals(0, analyzer.countExcellentStudents(null));
            assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

            assertEquals(0.0, analyzer.calculateValidAverage(null), 0.001);
            assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
        }
    }

    @Nested
    @DisplayName("Technique 2: Boundary Value Analysis (BVA)")
    class BoundaryValueAnalysisTests {

        @Test
        @DisplayName("BVA: Score Boundaries (-0.01, 0.0, 10.0, 10.01)")
        void testScoreBoundaries() {
            List<Double> boundaries = Arrays.asList(
                    -0.01,
                    0.0,
                    10.0,
                    10.01);

            assertEquals(1, analyzer.countExcellentStudents(boundaries));
            assertEquals(5.0, analyzer.calculateValidAverage(boundaries), 0.001);
        }

        @Test
        @DisplayName("BVA: Excellent Threshold Boundaries (7.99, 8.0, 8.01)")
        void testExcellentThresholdBoundaries() {
            List<Double> thresholdScores = Arrays.asList(
                    7.99,
                    8.0,
                    8.01);

            assertEquals(2, analyzer.countExcellentStudents(thresholdScores));
        }
    }

    @Nested
    @DisplayName("Technique 3: Decision Table (DT)")
    class DecisionTableTests {

        @Test
        @DisplayName("DT Rule: Valid Score AND >= 8.0 -> Counted")
        void testDecisionTableRules() {
            List<Double> cases = Arrays.asList(
                    Double.NaN,
                    5.0,
                    9.0);

            assertEquals(1, analyzer.countExcellentStudents(cases));
        }
    }
}