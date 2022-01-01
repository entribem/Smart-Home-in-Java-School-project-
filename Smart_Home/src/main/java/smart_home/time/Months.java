package smart_home.time;

/**
 * Enum defining months.
 * @author Petr Tuma
 */
public enum Months {
    January("January", 31),
    February("February", 28),
    March("March", 31), 
    April("April", 30), 
    May("May", 31), 
    June("June", 30),
    July("July", 31),
    August("August", 31),
    September("September", 30),
    October("October", 31), 
    November("November", 30), 
    December("December", 31);
    
    private final String name;
    private final int length;
    
    private Months(String name, int length) {
        this.name = name;
        this.length = length;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getLength() {
        return this.length;
    }
    
}
