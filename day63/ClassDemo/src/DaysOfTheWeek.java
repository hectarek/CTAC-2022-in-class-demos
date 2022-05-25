public enum DaysOfTheWeek {
    MONDAY(true), 
    TUESDAY(true), 
    WEDNESDAY(true), 
    THURSDAY(true), 
    FRIDAY(true), 
    SATURDAY(false), 
    SUNDAY(false);

    boolean isWeekDay;

    DaysOfTheWeek(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
}
