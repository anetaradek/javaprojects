package DaysOfWeek;

import static DaysOfWeek.DayOfWeek.*;

public class DaysOfWeekTester {
    public static void main(String[] args) {
        getWeekends();
        getWorkingDays();
        MON.isWeekend();
        SAT.isWeekend();
        WED.isWorking();
        SUN.isWorking();
        THU.fromEnglishName();
        TUE.fromPolishName();
    }
}