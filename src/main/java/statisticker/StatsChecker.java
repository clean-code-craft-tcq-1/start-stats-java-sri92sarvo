package statisticker;

import statisticker.alert.IAlerter;

import java.util.List;

public class StatsChecker {

    private final float maxThreshold;
    private final IAlerter[] iAlerter;

    public StatsChecker(float maxThreshold, IAlerter[] alerters) {
        this.maxThreshold = maxThreshold;
        this.iAlerter = alerters;
    }

    public void checkAndAlert(List<Float> numbers) {
        Statistics.Stats s = Statistics.getStatistics(numbers);
        if (s.max > this.maxThreshold) {
            for (IAlerter iAlerter : this.iAlerter) {
                iAlerter.alert();
            }
        }
    }
}
