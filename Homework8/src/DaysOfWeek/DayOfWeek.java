package DaysOfWeek;

import java.util.ArrayList;
import java.util.Collection;
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


    public boolean isWorking() {
        boolean isWorking2;
        isWorking2= isWorking;
        return isWorking2;
    }

    public boolean isWeekend() {
        boolean isWeekend;
        isWeekend= !isWorking;
        return isWeekend;
    }

    public static Collection<DayOfWeek> getWeekends() {
        List<DayOfWeek> weekend = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (!day.isWorking) {
                weekend.add(day);
            }
        }
        return weekend;
    }

    public static Collection<DayOfWeek> getWorkingDays() {
        List<DayOfWeek> workingDays = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.isWorking) {
                workingDays.add(day);
            }
        }
        return workingDays;
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek day : values()) {
            if (day.englishName.equals(englishName)) {
                return day;
            }
        }throw new IllegalArgumentException("There is no day with english name "+englishName);
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek day : values()) {
            if (day.polishName.equals(polishName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("There is no day with polish name "+polishName);
    }
    public static void printElements(Collection c){
        for (Object d : c) {
            System.out.println(d);
        }
    }
}

