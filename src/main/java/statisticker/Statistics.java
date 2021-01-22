package statisticker;

import java.util.List;

public class Statistics {

    public static class Stats {
        public double average;
        public double max;
        public double min;
    }

    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats stats = new Stats();
        stats.average = numbers.stream().mapToDouble(val -> val).average().orElse(Float.NaN);
        stats.max = numbers.stream().mapToDouble(val -> val).max().orElse(Float.NaN);
        stats.min = numbers.stream().mapToDouble(val -> val).min().orElse(Float.NaN);

        return stats;
    }
}
