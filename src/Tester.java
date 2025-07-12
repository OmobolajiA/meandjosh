enum WEEKDAY {
    MONDAY("Day 1"),
    TUESDAY("Day 2"),
    WEDNESDAY("Day 3"),
    THURSDAY("Day 4"),
    FRIDAY("Day 5"),
    SATURDAY("Day 6"),
    SUNDAY("Day 7");
    private final String description;
    WEEKDAY(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
public class Tester {
    public static void main(String[] args) {
        System.out.println(WEEKDAY.MONDAY.getDescription());
        System.out.println(WEEKDAY.MONDAY);
    }
}