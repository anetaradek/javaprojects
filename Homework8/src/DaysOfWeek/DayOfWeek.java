package DaysOfWeek;

import java.util.ArrayList;
import java.util.List;

public enum DayOfWeek {
    MON("Monday", "Poniedziałek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Środa", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piątek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private String englishName, polishName;
    private boolean isWorking;

    DayOfWeek(String englishName, String polishName, boolean isWorking) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.isWorking = isWorking;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public void fromEnglishName() {
        System.out.println(getEnglishName());

    }

    public void fromPolishName() {
        System.out.println(getPolishName());
    }

    public void isWorking() {
        if (isWorking) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void isWeekend() {
        if (!isWorking) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void getWeekends() {
        List<DayOfWeek> weekend = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (!day.isWorking) {
                weekend.add(day);
            }
        }
        System.out.println(weekend.toString());
    }

    public static void getWorkingDays() {
        List<DayOfWeek> workingDays = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.isWorking) {
                workingDays.add(day);
            }
        }
        System.out.println(workingDays.toString());
    }
}
