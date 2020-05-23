package DaysOfWeek;

import static DaysOfWeek.DayOfWeek.*;

public class DaysOfWeekTester {
    public static void main(String[] args) {

        for (Object d : getWeekends()) {
            System.out.println("Weekend: " + d);
        }
        for (Object d : getWorkingDays()) {
            System.out.println("Working day: " + d);
        }
        System.out.println("Is Monday a weekend? " + MON.isWeekend());
        System.out.println("Is Saturday a weekend? " + SAT.isWeekend());
        System.out.println("Is Wednesday a working day? " + WED.isWorking());
        System.out.println("Is Sunday a working day? " + SUN.isWorking());

        try {
            System.out.println("Wotrek is a " + fromPolishName("Wotrek"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Wtorek is a " + fromPolishName("Wtorek"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Thusday is a " + fromEnglishName("Thusday"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Thursday is a " + fromEnglishName("Thursday"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}