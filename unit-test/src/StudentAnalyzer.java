import java.util.List;

public class StudentAnalyzer {

    private boolean isValidScore(Double score) {
        return score != null && Double.isFinite(score) && score >= 0.0 && score <= 10.0;
    }

    public long countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        return scores.stream()
                .filter(this::isValidScore)
                .filter(s -> s >= 8.0)
                .count();
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        return scores.stream()
                .filter(this::isValidScore)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}