import java.util.List;

public class StudentAnalyzer {

    /**
     * @param scores 
     * @return 
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score < 0 || score > 10) {
                continue;
            }
            if (score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        int validCount = 0;

        for (Double score : scores) {
            if (score < 0 || score > 10) {
                continue;
            }
            sum += score;
            validCount++;
        }

        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}