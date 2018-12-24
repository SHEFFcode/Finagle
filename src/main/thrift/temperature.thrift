namespace * com.shefmachine.temperature.thrift
/**
 * temperature in celisus and timestamp in UTC milliseconds
 */
struct TemperatureDatum {
 1: i32 celcius,
 2: i64 timestamp
}

service TemperatureService {
    /** store a datum */
    void add(1: TemperatureDatum damum);
    /** return the mean temperature */
    double mean();
}