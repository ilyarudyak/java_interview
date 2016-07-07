package tomek.car;

/**
 * Created by ilyarudyak on 7/7/16.
 */
public interface Car {
    boolean needsFuel();
    double getEngineTemperature();
    void driveTo(String destination);
}
