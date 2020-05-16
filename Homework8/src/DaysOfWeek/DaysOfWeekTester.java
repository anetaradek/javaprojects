package DaysOfWeek;

import java.util.Arrays;

import static DaysOfWeek.DayOfWeek.*;

public class DaysOfWeekTester {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(getWeekends().toArray())));
        System.out.println(Arrays.toString(getWorkingDays().toArray()));
        System.out.println(MON.isWeekend());
        System.out.println(SAT.isWeekend());
        System.out.println(WED.isWorking());
        System.out.println(SUN.isWorking());
        System.out.println(fromPolishName("Wtorek"));
        System.out.println(fromEnglishName("Thursday"));
    }
}