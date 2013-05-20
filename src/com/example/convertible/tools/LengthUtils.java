package com.example.convertible.tools;

/**
 * Created with IntelliJ IDEA.
 * User: shawli
 * Date: 19/05/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthUtils {

    public static Double kilometreToMetre(Double km) {
        return (km*1000);
    }

    public static Double kilometreToCentimetre(Double km) {
        return (km*100000);
    }

    public static Double kilometreToMillimetre(Double km) {
        return (km*1000000);
    }

    public static Double metresToKilometres(Double m) {
        return (m / 1000);
    }

    public static Double metresToCentimetres(Double m) {
        return (m*100);
    }

    public static Double metresToMilliimetres(Double m) {
        return (m*1000);
    }
}
