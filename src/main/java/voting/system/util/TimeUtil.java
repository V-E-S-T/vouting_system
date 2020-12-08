package voting.system.util;

import java.time.LocalDateTime;

public class TimeUtil {

    public static boolean isBetween(LocalDateTime current, LocalDateTime start, LocalDateTime end){
        return current.compareTo(start) >= 0 && current.compareTo(end) < 0;
    }
}
