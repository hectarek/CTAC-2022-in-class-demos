// It is actually extending the Enum class

public enum DaysOfTheWeek {
    MONDAY(false),
    TUESDAY(false), 
    WEDNESDAY(false), 
    THURSDAY(false), 
    FRIDAY(false), 
    SATURDAY(true), 
    SUNDAY(true);

    // need final so that they are constants
    final boolean isWeekend;

    DaysOfTheWeek (boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}


// public enum DaysOfTheWeek {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
// }