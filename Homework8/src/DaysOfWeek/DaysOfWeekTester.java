package DaysOfWeek;

import java.util.Arrays;

import static DaysOfWeek.DayOfWeek.*;

public class DaysOfWeekTester {
    public static void main(String[] args) {
        printElements(getWeekends());
        printElements(getWorkingDays());

        System.out.println(MON.isWeekend());
        System.out.println(SAT.isWeekend());
        System.out.println(WED.isWorking());
        System.out.println(SUN.isWorking());
        System.out.println(fromPolishName("Wtorek"));
        System.out.println(fromEnglishName("Thursday"));
    }
}