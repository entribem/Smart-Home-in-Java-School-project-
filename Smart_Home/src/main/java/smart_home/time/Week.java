package smart_home.time;

/**
 * Enum defining a week.
 * @author Petr Tuma
 */
public enum Week {
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
    Sunday("Sunday");
    
    private final String name;
    
    private Week(String name) {
        this.name = name;
    }
    
    public String getName() {
       return this.name; 
    }
    
}

