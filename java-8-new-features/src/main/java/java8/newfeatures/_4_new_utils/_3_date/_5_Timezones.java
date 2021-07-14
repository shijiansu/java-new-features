package java8.newfeatures._4_new_utils._3_date;

import java.time.ZoneId;

public class _5_Timezones {
  public static void main(String[] args) {
    System.out.println(ZoneId.getAvailableZoneIds());
    // prints all available timezone ids
    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    ZoneId zone2 = ZoneId.of("Brazil/East");
    System.out.println(zone1.getRules());
    System.out.println(zone2.getRules());
    // ZoneRules[currentStandardOffset=+01:00]
    // ZoneRules[currentStandardOffset=-03:00]
  }
}
